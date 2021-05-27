
package com.pluralsigt.cxfdemo;

import javax.jws.WebService;

@WebService(endpointInterface = "com.pluralsigt.cxfdemo.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

    public String sayHi(String text) {
        return "Hello " + text;
    }
}

