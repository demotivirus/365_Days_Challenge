package com.demotivirus.Day_109;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface WebserviceSEI {
    @WebMethod //annotation optional and is mainly used to provide a name attribute to the public method in wsdl
    String testService();

    @WebMethod
    String sayHelloTo(@WebParam(name = "text") String text);

    @WebMethod
    Goods getGoods();
}
