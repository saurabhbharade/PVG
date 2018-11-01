
package com.mescoe.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for student complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="student">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="backlog" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="beaggregate" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="branch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hsc" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="instituteName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phone" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="sid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ssc" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="yop" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "student", propOrder = {
    "backlog",
    "beaggregate",
    "branch",
    "email",
    "hsc",
    "instituteName",
    "password",
    "phone",
    "sid",
    "sname",
    "ssc",
    "status",
    "yop"
})
public class Student {

    protected int backlog;
    protected float beaggregate;
    protected String branch;
    protected String email;
    protected float hsc;
    protected String instituteName;
    protected String password;
    protected long phone;
    protected int sid;
    protected String sname;
    protected float ssc;
    protected int status;
    protected int yop;

    /**
     * Gets the value of the backlog property.
     * 
     */
    public int getBacklog() {
        return backlog;
    }

    /**
     * Sets the value of the backlog property.
     * 
     */
    public void setBacklog(int value) {
        this.backlog = value;
    }

    /**
     * Gets the value of the beaggregate property.
     * 
     */
    public float getBeaggregate() {
        return beaggregate;
    }

    /**
     * Sets the value of the beaggregate property.
     * 
     */
    public void setBeaggregate(float value) {
        this.beaggregate = value;
    }

    /**
     * Gets the value of the branch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranch() {
        return branch;
    }

    /**
     * Sets the value of the branch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranch(String value) {
        this.branch = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the hsc property.
     * 
     */
    public float getHsc() {
        return hsc;
    }

    /**
     * Sets the value of the hsc property.
     * 
     */
    public void setHsc(float value) {
        this.hsc = value;
    }

    /**
     * Gets the value of the instituteName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstituteName() {
        return instituteName;
    }

    /**
     * Sets the value of the instituteName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstituteName(String value) {
        this.instituteName = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the phone property.
     * 
     */
    public long getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     */
    public void setPhone(long value) {
        this.phone = value;
    }

    /**
     * Gets the value of the sid property.
     * 
     */
    public int getSid() {
        return sid;
    }

    /**
     * Sets the value of the sid property.
     * 
     */
    public void setSid(int value) {
        this.sid = value;
    }

    /**
     * Gets the value of the sname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSname() {
        return sname;
    }

    /**
     * Sets the value of the sname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSname(String value) {
        this.sname = value;
    }

    /**
     * Gets the value of the ssc property.
     * 
     */
    public float getSsc() {
        return ssc;
    }

    /**
     * Sets the value of the ssc property.
     * 
     */
    public void setSsc(float value) {
        this.ssc = value;
    }

    /**
     * Gets the value of the status property.
     * 
     */
    public int getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     */
    public void setStatus(int value) {
        this.status = value;
    }

    /**
     * Gets the value of the yop property.
     * 
     */
    public int getYop() {
        return yop;
    }

    /**
     * Sets the value of the yop property.
     * 
     */
    public void setYop(int value) {
        this.yop = value;
    }

}
