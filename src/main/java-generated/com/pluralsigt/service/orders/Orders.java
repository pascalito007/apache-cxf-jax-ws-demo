package com.pluralsigt.service.orders;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.4.3
 * 2021-05-26T14:23:16.011+02:00
 * Generated source version: 3.4.3
 *
 */
@WebService(targetNamespace = "http://www.pluralsigt.com/service/Orders/", name = "Orders")
@XmlSeeAlso({com.pluralsigt.schema.order.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface Orders {

    @WebMethod(operationName = "ProcessOrderPlacement", action = "http://www.pluralsigt.com/service/Orders/ProcessOrderPlacement")
    @WebResult(name = "orderInquiryResponse", targetNamespace = "http://www.pluralsigt.com/schema/Order", partName = "orderInquiryResponse")
    public com.pluralsigt.schema.order.OrderInquiryResponseType processOrderPlacement(

        @WebParam(partName = "orderInquiry", name = "orderInquiry", targetNamespace = "http://www.pluralsigt.com/schema/Order")
        com.pluralsigt.schema.order.OrderInquiryType orderInquiry
    );
}