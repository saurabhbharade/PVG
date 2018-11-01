
package com.mescoe.webservice;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "MescoeWebServiceService", targetNamespace = "http://webservice.mescoe.com/", wsdlLocation = "http://user-pc:8080/MescoeWebService/MescoeWebServiceService?wsdl")
public class MescoeWebServiceService
    extends Service
{

    private final static URL MESCOEWEBSERVICESERVICE_WSDL_LOCATION;
    private final static WebServiceException MESCOEWEBSERVICESERVICE_EXCEPTION;
    private final static QName MESCOEWEBSERVICESERVICE_QNAME = new QName("http://webservice.mescoe.com/", "MescoeWebServiceService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://user-pc:8080/MescoeWebService/MescoeWebServiceService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        MESCOEWEBSERVICESERVICE_WSDL_LOCATION = url;
        MESCOEWEBSERVICESERVICE_EXCEPTION = e;
    }

    public MescoeWebServiceService() {
        super(__getWsdlLocation(), MESCOEWEBSERVICESERVICE_QNAME);
    }

    public MescoeWebServiceService(WebServiceFeature... features) {
        super(__getWsdlLocation(), MESCOEWEBSERVICESERVICE_QNAME, features);
    }

    public MescoeWebServiceService(URL wsdlLocation) {
        super(wsdlLocation, MESCOEWEBSERVICESERVICE_QNAME);
    }

    public MescoeWebServiceService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, MESCOEWEBSERVICESERVICE_QNAME, features);
    }

    public MescoeWebServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public MescoeWebServiceService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns MescoeWebService
     */
    @WebEndpoint(name = "MescoeWebServicePort")
    public MescoeWebService getMescoeWebServicePort() {
        return super.getPort(new QName("http://webservice.mescoe.com/", "MescoeWebServicePort"), MescoeWebService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns MescoeWebService
     */
    @WebEndpoint(name = "MescoeWebServicePort")
    public MescoeWebService getMescoeWebServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://webservice.mescoe.com/", "MescoeWebServicePort"), MescoeWebService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (MESCOEWEBSERVICESERVICE_EXCEPTION!= null) {
            throw MESCOEWEBSERVICESERVICE_EXCEPTION;
        }
        return MESCOEWEBSERVICESERVICE_WSDL_LOCATION;
    }

}