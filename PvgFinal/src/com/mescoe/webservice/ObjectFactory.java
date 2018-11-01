
package com.mescoe.webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.mescoe.webservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Student_QNAME = new QName("http://webservice.mescoe.com/", "student");
    private final static QName _GetListOfStudentFromMescoe_QNAME = new QName("http://webservice.mescoe.com/", "getListOfStudentFromMescoe");
    private final static QName _GetListOfStudentFromMescoeResponse_QNAME = new QName("http://webservice.mescoe.com/", "getListOfStudentFromMescoeResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.mescoe.webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Student }
     * 
     */
    public Student createStudent() {
        return new Student();
    }

    /**
     * Create an instance of {@link GetListOfStudentFromMescoe }
     * 
     */
    public GetListOfStudentFromMescoe createGetListOfStudentFromMescoe() {
        return new GetListOfStudentFromMescoe();
    }

    /**
     * Create an instance of {@link GetListOfStudentFromMescoeResponse }
     * 
     */
    public GetListOfStudentFromMescoeResponse createGetListOfStudentFromMescoeResponse() {
        return new GetListOfStudentFromMescoeResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Student }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.mescoe.com/", name = "student")
    public JAXBElement<Student> createStudent(Student value) {
        return new JAXBElement<Student>(_Student_QNAME, Student.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListOfStudentFromMescoe }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.mescoe.com/", name = "getListOfStudentFromMescoe")
    public JAXBElement<GetListOfStudentFromMescoe> createGetListOfStudentFromMescoe(GetListOfStudentFromMescoe value) {
        return new JAXBElement<GetListOfStudentFromMescoe>(_GetListOfStudentFromMescoe_QNAME, GetListOfStudentFromMescoe.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListOfStudentFromMescoeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.mescoe.com/", name = "getListOfStudentFromMescoeResponse")
    public JAXBElement<GetListOfStudentFromMescoeResponse> createGetListOfStudentFromMescoeResponse(GetListOfStudentFromMescoeResponse value) {
        return new JAXBElement<GetListOfStudentFromMescoeResponse>(_GetListOfStudentFromMescoeResponse_QNAME, GetListOfStudentFromMescoeResponse.class, null, value);
    }

}
