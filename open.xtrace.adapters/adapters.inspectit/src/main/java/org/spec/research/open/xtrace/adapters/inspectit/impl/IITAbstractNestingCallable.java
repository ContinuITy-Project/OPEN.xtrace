package org.spec.research.open.xtrace.adapters.inspectit.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.spec.research.open.xtrace.api.core.TreeIterator;
import org.spec.research.open.xtrace.api.core.callables.Callable;
import org.spec.research.open.xtrace.api.core.callables.NestingCallable;
import org.spec.research.open.xtrace.api.utils.CallableIterator;

import rocks.inspectit.shared.all.communication.data.InvocationSequenceData;

public class IITAbstractNestingCallable extends IITAbstractTimedCallable implements NestingCallable {
	
	/** Serial version id. */
	private static final long serialVersionUID = -5881753880225309401L;
	private List<Callable> children = null;

	public IITAbstractNestingCallable(InvocationSequenceData isData, IITSubTraceImpl containingTrace, IITAbstractNestingCallable parent) {
		super(isData, containingTrace, parent);
	}

	@Override
	public TreeIterator<Callable> iterator() {
		return new CallableIterator(this);
	}

	@Override
	public List<Callable> getCallees() {
		if (children == null) {
			if (isData == null || isData.getNestedSequences().isEmpty()) {
				children = Collections.emptyList();
			} else {
				children = new ArrayList<Callable>(isData.getNestedSequences().size());
				for (InvocationSequenceData isd : isData.getNestedSequences()) {
					IITAbstractCallable child = containingTrace.createCallable(isd, containingTrace, this);
					children.add(child);
				}
			}
		}

		return Collections.unmodifiableList(children);
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T extends Callable> List<T> getCallees(Class<T> type) {

		List<T> result = null;
		for (Callable callable : getCallees()) {
			if (type.isAssignableFrom(callable.getClass())) {
				if (result == null) {
					result = new ArrayList<T>();
				}
				result.add((T) callable);
			}
		}

		return result == null ? Collections.unmodifiableList(Collections.<T> emptyList()) : Collections.unmodifiableList(result);

	}

	@Override
	public int getChildCount() {
		return (int) isData.getChildCount();
	}
	
	protected void addChild(Callable child){
		if(children == null){
			children = new ArrayList<Callable>();
		}
		children.add(child);
	}

}
