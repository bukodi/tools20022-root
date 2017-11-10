//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.01 at 08:02:27 PM CET 
//


package com.test.camt030;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NotificationOfCaseAssignmentV04 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NotificationOfCaseAssignmentV04">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Hdr" type="{urn:iso:std:iso:20022:tech:xsd:camt.030.001.04}ReportHeader4"/>
 *         &lt;element name="Case" type="{urn:iso:std:iso:20022:tech:xsd:camt.030.001.04}Case3"/>
 *         &lt;element name="Assgnmt" type="{urn:iso:std:iso:20022:tech:xsd:camt.030.001.04}CaseAssignment3"/>
 *         &lt;element name="Ntfctn" type="{urn:iso:std:iso:20022:tech:xsd:camt.030.001.04}CaseForwardingNotification3"/>
 *         &lt;element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:camt.030.001.04}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotificationOfCaseAssignmentV04", propOrder = {
    "hdr",
    "_case",
    "assgnmt",
    "ntfctn",
    "splmtryData"
})
public class NotificationOfCaseAssignmentV04 {

    @XmlElement(name = "Hdr", required = true)
    protected ReportHeader4 hdr;
    @XmlElement(name = "Case", required = true)
    protected Case3 _case;
    @XmlElement(name = "Assgnmt", required = true)
    protected CaseAssignment3 assgnmt;
    @XmlElement(name = "Ntfctn", required = true)
    protected CaseForwardingNotification3 ntfctn;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the hdr property.
     * 
     * @return
     *     possible object is
     *     {@link ReportHeader4 }
     *     
     */
    public ReportHeader4 getHdr() {
        return hdr;
    }

    /**
     * Sets the value of the hdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportHeader4 }
     *     
     */
    public void setHdr(ReportHeader4 value) {
        this.hdr = value;
    }

    /**
     * Gets the value of the case property.
     * 
     * @return
     *     possible object is
     *     {@link Case3 }
     *     
     */
    public Case3 getCase() {
        return _case;
    }

    /**
     * Sets the value of the case property.
     * 
     * @param value
     *     allowed object is
     *     {@link Case3 }
     *     
     */
    public void setCase(Case3 value) {
        this._case = value;
    }

    /**
     * Gets the value of the assgnmt property.
     * 
     * @return
     *     possible object is
     *     {@link CaseAssignment3 }
     *     
     */
    public CaseAssignment3 getAssgnmt() {
        return assgnmt;
    }

    /**
     * Sets the value of the assgnmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CaseAssignment3 }
     *     
     */
    public void setAssgnmt(CaseAssignment3 value) {
        this.assgnmt = value;
    }

    /**
     * Gets the value of the ntfctn property.
     * 
     * @return
     *     possible object is
     *     {@link CaseForwardingNotification3 }
     *     
     */
    public CaseForwardingNotification3 getNtfctn() {
        return ntfctn;
    }

    /**
     * Sets the value of the ntfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CaseForwardingNotification3 }
     *     
     */
    public void setNtfctn(CaseForwardingNotification3 value) {
        this.ntfctn = value;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the splmtryData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSplmtryData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplementaryData1 }
     * 
     * 
     */
    public List<SupplementaryData1> getSplmtryData() {
        if (splmtryData == null) {
            splmtryData = new ArrayList<SupplementaryData1>();
        }
        return this.splmtryData;
    }

}
