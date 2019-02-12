package com.example.jboss.soap;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.time.LocalDateTime;
import javax.annotation.security.RolesAllowed;

@WebService
public class CalculatorWS {

    @WebMethod
    public double fazerOp(@WebParam(name = "num1") double a
            , @WebParam(name = "num2") double b
            , @WebParam(name = "op") String op) {
        switch (op) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                return a / b;
            default:
                throw new IllegalArgumentException("Operation '" + op
                        + "' not recognized. Use '+', '-', '*' ou '/'.");
        }
    }

    @WebMethod
    public String sayHello(String name) {
        return "Say Hello to " + name + " at " + LocalDateTime.now();
    }
}
