package de.uniba.dsg.soa;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "GreetingsPortType", targetNamespace = "http://uniba.de/dsg/soa/")
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface GreetingsPortType {


    /**
     * 
     * @param name
     * @return
     *     returns java.lang.String
     */
    @WebMethod(action = "http://uniba.de/dsg/soa/greet")
    @WebResult(name = "greeting", partName = "greeting")
    public String greet(
        @WebParam(name = "name", partName = "name")
        String name);

}