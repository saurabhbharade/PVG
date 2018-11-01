
package com.mescoe.webservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getListOfStudentFromMescoe complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getListOfStudentFromMescoe">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arg0" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="arg1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="arg2" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="arg3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="arg4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="arg5" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="arg6" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="arg7" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="arg8" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="arg9" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="arg10" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="arg11" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="arg12" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="arg13" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getListOfStudentFromMescoe", propOrder = {
    "arg0",
    "arg1",
    "arg2",
    "arg3",
    "arg4",
    "arg5",
    "arg6",
    "arg7",
    "arg8",
    "arg9",
    "arg10",
    "arg11",
    "arg12",
    "arg13"
})
public class GetListOfStudentFromMescoe {

    protected int arg0;
    protected String arg1;
    protected float arg2;
    protected String arg3;
    protected String arg4;
    protected float arg5;
    protected float arg6;
    protected float arg7;
    protected int arg8;
    protected int arg9;
    protected int arg10;
    protected int arg11;
    protected int arg12;
    protected List<String> arg13;

    /**
     * Gets the value of the arg0 property.
     * 
     */
    public int getArg0() {
        return arg0;
    }

    /**
     * Sets the value of the arg0 property.
     * 
     */
    public void setArg0(int value) {
        this.arg0 = value;
    }

    /**
     * Gets the value of the arg1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArg1() {
        return arg1;
    }

    /**
     * Sets the value of the arg1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArg1(String value) {
        this.arg1 = value;
    }

    /**
     * Gets the value of the arg2 property.
     * 
     */
    public float getArg2() {
        return arg2;
    }

    /**
     * Sets the value of the arg2 property.
     * 
     */
    public void setArg2(float value) {
        this.arg2 = value;
    }

    /**
     * Gets the value of the arg3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArg3() {
        return arg3;
    }

    /**
     * Sets the value of the arg3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArg3(String value) {
        this.arg3 = value;
    }

    /**
     * Gets the value of the arg4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArg4() {
        return arg4;
    }

    /**
     * Sets the value of the arg4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArg4(String value) {
        this.arg4 = value;
    }

    /**
     * Gets the value of the arg5 property.
     * 
     */
    public float getArg5() {
        return arg5;
    }

    /**
     * Sets the value of the arg5 property.
     * 
     */
    public void setArg5(float value) {
        this.arg5 = value;
    }

    /**
     * Gets the value of the arg6 property.
     * 
     */
    public float getArg6() {
        return arg6;
    }

    /**
     * Sets the value of the arg6 property.
     * 
     */
    public void setArg6(float value) {
        this.arg6 = value;
    }

    /**
     * Gets the value of the arg7 property.
     * 
     */
    public float getArg7() {
        return arg7;
    }

    /**
     * Sets the value of the arg7 property.
     * 
     */
    public void setArg7(float value) {
        this.arg7 = value;
    }

    /**
     * Gets the value of the arg8 property.
     * 
     */
    public int getArg8() {
        return arg8;
    }

    /**
     * Sets the value of the arg8 property.
     * 
     */
    public void setArg8(int value) {
        this.arg8 = value;
    }

    /**
     * Gets the value of the arg9 property.
     * 
     */
    public int getArg9() {
        return arg9;
    }

    /**
     * Sets the value of the arg9 property.
     * 
     */
    public void setArg9(int value) {
        this.arg9 = value;
    }

    /**
     * Gets the value of the arg10 property.
     * 
     */
    public int getArg10() {
        return arg10;
    }

    /**
     * Sets the value of the arg10 property.
     * 
     */
    public void setArg10(int value) {
        this.arg10 = value;
    }

    /**
     * Gets the value of the arg11 property.
     * 
     */
    public int getArg11() {
        return arg11;
    }

    /**
     * Sets the value of the arg11 property.
     * 
     */
    public void setArg11(int value) {
        this.arg11 = value;
    }

    /**
     * Gets the value of the arg12 property.
     * 
     */
    public int getArg12() {
        return arg12;
    }

    /**
     * Sets the value of the arg12 property.
     * 
     */
    public void setArg12(int value) {
        this.arg12 = value;
    }

    /**
     * Gets the value of the arg13 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the arg13 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArg13().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getArg13() {
        if (arg13 == null) {
            arg13 = new ArrayList<String>();
        }
        return this.arg13;
    }

}
