
package io.jsd.training.client.ws.trainingcenter.clients.webservice;

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
@WebServiceClient(name = "FormationWSService", targetNamespace = "http://webservice.centreformation.treeptik.fr/", wsdlLocation = "http://localhost:8080/CentreFormation/FormationWS?wsdl")
public class FormationWSService
    extends Service
{

    private final static URL FORMATIONWSSERVICE_WSDL_LOCATION;
    private final static WebServiceException FORMATIONWSSERVICE_EXCEPTION;
    private final static QName FORMATIONWSSERVICE_QNAME = new QName("http://webservice.centreformation.treeptik.fr/", "FormationWSService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/CentreFormation/FormationWS?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        FORMATIONWSSERVICE_WSDL_LOCATION = url;
        FORMATIONWSSERVICE_EXCEPTION = e;
    }

    public FormationWSService() {
        super(__getWsdlLocation(), FORMATIONWSSERVICE_QNAME);
    }

    public FormationWSService(WebServiceFeature... features) {
        super(__getWsdlLocation(), FORMATIONWSSERVICE_QNAME, features);
    }

    public FormationWSService(URL wsdlLocation) {
        super(wsdlLocation, FORMATIONWSSERVICE_QNAME);
    }

    public FormationWSService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, FORMATIONWSSERVICE_QNAME, features);
    }

    public FormationWSService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public FormationWSService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns FormationWS
     */
    @WebEndpoint(name = "FormationWSPort")
    public FormationWS getFormationWSPort() {
        return super.getPort(new QName("http://webservice.centreformation.treeptik.fr/", "FormationWSPort"), FormationWS.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns FormationWS
     */
    @WebEndpoint(name = "FormationWSPort")
    public FormationWS getFormationWSPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://webservice.centreformation.treeptik.fr/", "FormationWSPort"), FormationWS.class, features);
    }

    private static URL __getWsdlLocation() {
        if (FORMATIONWSSERVICE_EXCEPTION!= null) {
            throw FORMATIONWSSERVICE_EXCEPTION;
        }
        return FORMATIONWSSERVICE_WSDL_LOCATION;
    }

}