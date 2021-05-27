package com.pluralsigt.cxfdemo;

import javax.jws.WebService;

import com.pluralsigt.schema.order.AccountType;
import com.pluralsigt.schema.order.ObjectFactory;
import com.pluralsigt.schema.order.OrderInquiryResponseType;
import com.pluralsigt.schema.order.OrderInquiryType;
import com.pluralsigt.service.orders.Orders;

@WebService(portName="OrdersSOAP", serviceName="Orders", endpointInterface="com.pluralsigt.service.orders.Orders", targetNamespace="http://www.pluralsigt.com/service/Orders/")
public class DefaultOrdersEndpoint implements Orders {

	@Override
	public OrderInquiryResponseType processOrderPlacement(OrderInquiryType orderInquiry) {
		ObjectFactory factory=new ObjectFactory();
		OrderInquiryResponseType response = factory.createOrderInquiryResponseType();
		AccountType account=factory.createAccountType();
		account.setAccountId(1);
		response.setAccount(account);
		return response;
	}

}
