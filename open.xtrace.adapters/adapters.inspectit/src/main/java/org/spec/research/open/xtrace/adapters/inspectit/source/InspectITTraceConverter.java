package org.spec.research.open.xtrace.adapters.inspectit.source;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Properties;

import org.diagnoseit.spike.inspectit.trace.impl.IITTraceImpl;
import org.diagnoseit.spike.inspectit.trace.importer.InvocationSequences;
import org.diagnoseit.spike.inspectit.trace.importer.SerializerWrapper;
import org.spec.research.open.xtrace.api.core.Trace;
import org.spec.research.open.xtrace.shared.TraceConverter;

import rocks.inspectit.shared.all.cmr.model.PlatformIdent;
import rocks.inspectit.shared.all.communication.data.InvocationSequenceData;

public class InspectITTraceConverter implements TraceConverter {
	private static final String DATA_PATH = "inspectit.fileimporter.datapath";
	private static Iterator<InvocationSequenceData> isDataIterator = null;
	private static PlatformIdent pIdent = null;

	// TODO threshold been commented out. Adapter should not decide whether the
	// trace is faulty in anyway, as the task of adapter is only to create
	// OPEN.xtrace representation of the input traces. What are the traces used
	// later for, it is of no concern for the adapter.
	// private double responseTimeThreshold = -1;

	private void readInvocations(final String path) {
		try {
			SerializerWrapper serializer = new SerializerWrapper();
			InvocationSequences iSequences = serializer.readInvocationSequences(path);
			isDataIterator = iSequences.iterator();
			pIdent = iSequences.getPlatformIdent();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	/*
	 * Not needed anymore. Code moved to convertTraces(String)
	 * (non-Javadoc)
	 */
	// private Trace getNextTrace() {
	// if (!isDataIterator.hasNext()) {
	// throw new NoSuchElementException("Iterator reached the end!");
	// }
	// InvocationSequenceData isd = null;
	// do {
	// isd = isDataIterator.next();
	// } while (isDataIterator.hasNext() && isd.getDuration() <
	// responseTimeThreshold);
	// if (isd != null) {
	// return (new IITTraceImpl(isd, pIdent));
	// }
	// throw new NoSuchElementException("Iterator reached the end!");
	// }

	@Override
	public void initialize(Properties properties) {
		String dataPath = properties.getProperty(DATA_PATH);
		if (dataPath == null) {
			throw new IllegalArgumentException(
					"Data path has not been specified for the inspectIT file importer trace source.");
		}
		this.readInvocations(dataPath);

		// String rtThresholdStr =
		// properties.getProperty(RESPONSETIME_THRESHOLD);
		// if (rtThresholdStr == null) {
		// rtThresholdStr = String.valueOf(RESPONSETIME_THRESHOLD_DEFAULT);
		// System.out.println("No response time threshold specified. Using
		// default value: 1000ms!");
		// }
		// responseTimeThreshold = Double.parseDouble(rtThresholdStr);
	}

	@Override
	public List<Trace> convertTraces(final String path) {

		if (path == null) {
			throw new IllegalArgumentException(
					"Data path has not been specified for the inspectIT file importer trace source.");
		}
		if (!(new File(path)).exists()) {
			throw new IllegalArgumentException("No file or directory found for the provided path.");
		}

		List<Trace> listConvertedTraces = new LinkedList<Trace>();

		this.readInvocations(path);

		while (isDataIterator.hasNext()) {
			listConvertedTraces.add(new IITTraceImpl(isDataIterator.next(), pIdent));
		}
		return listConvertedTraces;
	}

	@Override
	public Trace convertTrace(Object trace) {
		throw new UnsupportedOperationException();
	}

}
