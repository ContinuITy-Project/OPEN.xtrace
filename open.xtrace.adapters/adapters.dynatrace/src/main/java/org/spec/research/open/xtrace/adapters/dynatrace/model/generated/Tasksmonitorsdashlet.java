//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.01.13 at 11:58:26 AM CET 
//


package org.spec.research.open.xtrace.adapters.dynatrace.model.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="source" type="{}sourceType" minOccurs="0"/>
 *         &lt;element name="comparesource" type="{}sourceType" minOccurs="0"/>
 *         &lt;element name="tasksmonitorsoverview" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="taskmonitoroverview" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="header" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="status" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="lastrun" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *                           &lt;attribute name="lastrunresult" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="nextrun" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *                           &lt;attribute name="currentrun" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="duration" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="description" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="schedule" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="target" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="pluginstate" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="system" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="description" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "source",
    "comparesource",
    "tasksmonitorsoverview"
})
@XmlRootElement(name = "tasksmonitorsdashlet")
public class Tasksmonitorsdashlet {

    protected SourceType source;
    protected SourceType comparesource;
    protected Tasksmonitorsdashlet.Tasksmonitorsoverview tasksmonitorsoverview;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "description")
    protected String description;

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link SourceType }
     *     
     */
    public SourceType getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link SourceType }
     *     
     */
    public void setSource(SourceType value) {
        this.source = value;
    }

    /**
     * Gets the value of the comparesource property.
     * 
     * @return
     *     possible object is
     *     {@link SourceType }
     *     
     */
    public SourceType getComparesource() {
        return comparesource;
    }

    /**
     * Sets the value of the comparesource property.
     * 
     * @param value
     *     allowed object is
     *     {@link SourceType }
     *     
     */
    public void setComparesource(SourceType value) {
        this.comparesource = value;
    }

    /**
     * Gets the value of the tasksmonitorsoverview property.
     * 
     * @return
     *     possible object is
     *     {@link Tasksmonitorsdashlet.Tasksmonitorsoverview }
     *     
     */
    public Tasksmonitorsdashlet.Tasksmonitorsoverview getTasksmonitorsoverview() {
        return tasksmonitorsoverview;
    }

    /**
     * Sets the value of the tasksmonitorsoverview property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tasksmonitorsdashlet.Tasksmonitorsoverview }
     *     
     */
    public void setTasksmonitorsoverview(Tasksmonitorsdashlet.Tasksmonitorsoverview value) {
        this.tasksmonitorsoverview = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="taskmonitoroverview" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="header" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="status" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="lastrun" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *                 &lt;attribute name="lastrunresult" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="nextrun" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *                 &lt;attribute name="currentrun" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="duration" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="description" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="schedule" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="target" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="pluginstate" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="system" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "taskmonitoroverview"
    })
    public static class Tasksmonitorsoverview {

        protected List<Tasksmonitorsdashlet.Tasksmonitorsoverview.Taskmonitoroverview> taskmonitoroverview;

        /**
         * Gets the value of the taskmonitoroverview property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the taskmonitoroverview property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTaskmonitoroverview().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Tasksmonitorsdashlet.Tasksmonitorsoverview.Taskmonitoroverview }
         * 
         * 
         */
        public List<Tasksmonitorsdashlet.Tasksmonitorsoverview.Taskmonitoroverview> getTaskmonitoroverview() {
            if (taskmonitoroverview == null) {
                taskmonitoroverview = new ArrayList<Tasksmonitorsdashlet.Tasksmonitorsoverview.Taskmonitoroverview>();
            }
            return this.taskmonitoroverview;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="header" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="status" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="lastrun" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
         *       &lt;attribute name="lastrunresult" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="nextrun" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
         *       &lt;attribute name="currentrun" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="duration" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="description" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="schedule" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="target" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="pluginstate" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="system" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Taskmonitoroverview {

            @XmlAttribute(name = "header")
            protected String header;
            @XmlAttribute(name = "id")
            protected String id;
            @XmlAttribute(name = "type")
            protected String type;
            @XmlAttribute(name = "status")
            protected String status;
            @XmlAttribute(name = "lastrun")
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar lastrun;
            @XmlAttribute(name = "lastrunresult")
            protected String lastrunresult;
            @XmlAttribute(name = "nextrun")
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar nextrun;
            @XmlAttribute(name = "currentrun")
            protected String currentrun;
            @XmlAttribute(name = "duration")
            protected String duration;
            @XmlAttribute(name = "description")
            protected String description;
            @XmlAttribute(name = "schedule")
            protected String schedule;
            @XmlAttribute(name = "target")
            protected String target;
            @XmlAttribute(name = "pluginstate")
            protected String pluginstate;
            @XmlAttribute(name = "system")
            protected String system;

            /**
             * Gets the value of the header property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getHeader() {
                return header;
            }

            /**
             * Sets the value of the header property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setHeader(String value) {
                this.header = value;
            }

            /**
             * Gets the value of the id property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getId() {
                return id;
            }

            /**
             * Sets the value of the id property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setId(String value) {
                this.id = value;
            }

            /**
             * Gets the value of the type property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getType() {
                return type;
            }

            /**
             * Sets the value of the type property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setType(String value) {
                this.type = value;
            }

            /**
             * Gets the value of the status property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStatus() {
                return status;
            }

            /**
             * Sets the value of the status property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStatus(String value) {
                this.status = value;
            }

            /**
             * Gets the value of the lastrun property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getLastrun() {
                return lastrun;
            }

            /**
             * Sets the value of the lastrun property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setLastrun(XMLGregorianCalendar value) {
                this.lastrun = value;
            }

            /**
             * Gets the value of the lastrunresult property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLastrunresult() {
                return lastrunresult;
            }

            /**
             * Sets the value of the lastrunresult property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLastrunresult(String value) {
                this.lastrunresult = value;
            }

            /**
             * Gets the value of the nextrun property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getNextrun() {
                return nextrun;
            }

            /**
             * Sets the value of the nextrun property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setNextrun(XMLGregorianCalendar value) {
                this.nextrun = value;
            }

            /**
             * Gets the value of the currentrun property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCurrentrun() {
                return currentrun;
            }

            /**
             * Sets the value of the currentrun property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCurrentrun(String value) {
                this.currentrun = value;
            }

            /**
             * Gets the value of the duration property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDuration() {
                return duration;
            }

            /**
             * Sets the value of the duration property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDuration(String value) {
                this.duration = value;
            }

            /**
             * Gets the value of the description property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDescription() {
                return description;
            }

            /**
             * Sets the value of the description property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDescription(String value) {
                this.description = value;
            }

            /**
             * Gets the value of the schedule property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSchedule() {
                return schedule;
            }

            /**
             * Sets the value of the schedule property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSchedule(String value) {
                this.schedule = value;
            }

            /**
             * Gets the value of the target property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTarget() {
                return target;
            }

            /**
             * Sets the value of the target property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTarget(String value) {
                this.target = value;
            }

            /**
             * Gets the value of the pluginstate property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPluginstate() {
                return pluginstate;
            }

            /**
             * Sets the value of the pluginstate property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPluginstate(String value) {
                this.pluginstate = value;
            }

            /**
             * Gets the value of the system property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSystem() {
                return system;
            }

            /**
             * Sets the value of the system property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSystem(String value) {
                this.system = value;
            }

        }

    }

}