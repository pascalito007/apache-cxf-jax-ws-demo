package com.pluralsigt.service.orders;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.4.3
 * 2021-05-26T14:23:16.038+02:00
 * Generated source version: 3.4.3
 *
 */
@WebServiceClient(name = "Orders",
                  wsdlLocation = "file:/Users/mewejp/eclipse-workspace/apache-cxf-jax-ws-demo/src/main/resources/wsdl/Orders.wsdl",
                  targetNamespace = "http://www.pluralsigt.com/service/Orders/")
public class Orders_Service extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.pluralsigt.com/service/Orders/", "Orders");
    public final static QName OrdersSOAP = new QName("http://www.pluralsigt.com/service/Orders/", "OrdersSOAP");
    static {
        URL url = null;
        try {
            url = new URL("file:/Users/mewejp/eclipse-workspace/apache-cxf-jax-ws-demo/src/main/resources/wsdl/Orders.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(Orders_Service.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "file:/Users/mewejp/eclipse-workspace/apache-cxf-jax-ws-demo/src/main/resources/wsdl/Orders.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public Orders_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public Orders_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Orders_Service() {
        super(WSDL_LOCATION, SERVICE);
    }

    public Orders_Service(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public Orders_Service(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public Orders_Service(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns Orders
     */
    @WebEndpoint(name = "OrdersSOAP")
    public Orders getOrdersSOAP() {
        return super.getPort(OrdersSOAP, Orders.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Orders
     */
    @WebEndpoint(name = "OrdersSOAP")
    public Orders getOrdersSOAP(WebServiceFeature... features) {
        return super.getPort(OrdersSOAP, Orders.class, features);
    }

}
