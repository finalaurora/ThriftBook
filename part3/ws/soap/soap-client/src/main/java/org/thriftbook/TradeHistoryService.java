
package org.thriftbook;

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
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "TradeHistoryService", targetNamespace = "http://thriftbook.org/", wsdlLocation = "http://localhost:8080/soap-server/tradehistory?wsdl")
public class TradeHistoryService
    extends Service
{

    private final static URL TRADEHISTORYSERVICE_WSDL_LOCATION;
    private final static WebServiceException TRADEHISTORYSERVICE_EXCEPTION;
    private final static QName TRADEHISTORYSERVICE_QNAME = new QName("http://thriftbook.org/", "TradeHistoryService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/soap-server/tradehistory?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        TRADEHISTORYSERVICE_WSDL_LOCATION = url;
        TRADEHISTORYSERVICE_EXCEPTION = e;
    }

    public TradeHistoryService() {
        super(__getWsdlLocation(), TRADEHISTORYSERVICE_QNAME);
    }

    public TradeHistoryService(WebServiceFeature... features) {
        super(__getWsdlLocation(), TRADEHISTORYSERVICE_QNAME, features);
    }

    public TradeHistoryService(URL wsdlLocation) {
        super(wsdlLocation, TRADEHISTORYSERVICE_QNAME);
    }

    public TradeHistoryService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, TRADEHISTORYSERVICE_QNAME, features);
    }

    public TradeHistoryService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public TradeHistoryService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns TradeHistory
     */
    @WebEndpoint(name = "TradeHistoryPort")
    public TradeHistory getTradeHistoryPort() {
        return super.getPort(new QName("http://thriftbook.org/", "TradeHistoryPort"), TradeHistory.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns TradeHistory
     */
    @WebEndpoint(name = "TradeHistoryPort")
    public TradeHistory getTradeHistoryPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://thriftbook.org/", "TradeHistoryPort"), TradeHistory.class, features);
    }

    private static URL __getWsdlLocation() {
        if (TRADEHISTORYSERVICE_EXCEPTION!= null) {
            throw TRADEHISTORYSERVICE_EXCEPTION;
        }
        return TRADEHISTORYSERVICE_WSDL_LOCATION;
    }

}
