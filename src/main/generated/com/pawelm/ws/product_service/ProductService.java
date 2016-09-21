package com.pawelm.ws.product_service;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.6
 * 2016-09-21T16:49:00.769+02:00
 * Generated source version: 2.7.6
 * 
 */
@WebServiceClient(name = "ProductService", 
                  wsdlLocation = "file:/D:/JBOSS_FUSE/workspaceIJ/externresource/camelCXFSimpleExample/src/main/resources/productService.wsdl",
                  targetNamespace = "http://ws.pawelm.com/product-service") 
public class ProductService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://ws.pawelm.com/product-service", "ProductService");
    public final static QName ProductPort = new QName("http://ws.pawelm.com/product-service", "ProductPort");
    static {
        URL url = null;
        try {
            url = new URL("file:/D:/JBOSS_FUSE/workspaceIJ/externresource/camelCXFSimpleExample/src/main/resources/productService.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(ProductService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/D:/JBOSS_FUSE/workspaceIJ/externresource/camelCXFSimpleExample/src/main/resources/productService.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public ProductService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public ProductService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ProductService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public ProductService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public ProductService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public ProductService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns Product
     */
    @WebEndpoint(name = "ProductPort")
    public Product getProductPort() {
        return super.getPort(ProductPort, Product.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Product
     */
    @WebEndpoint(name = "ProductPort")
    public Product getProductPort(WebServiceFeature... features) {
        return super.getPort(ProductPort, Product.class, features);
    }

}
