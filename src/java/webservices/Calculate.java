/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webservices;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author Lenc
 */
@Path("calculatews")
public class Calculate {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of Calculate
     */
    public Calculate() {
    }

    /**
     * Retrieves representation of an instance of webservices.Calculate
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String addNum(@QueryParam("num1")int num1, @QueryParam("num2") int num2, @QueryParam("operator")String operator) {
        //TODO return proper representation object
        //throw new UnsupportedOperationException();
        if (operator.equals("add")){
            return "The sum of " +num1+ " and " +num2+ " is: " +(num1+num2);
        }
        else if (operator.equals("subtract")){
            return num1 + " subtract " +num2+ " is: " +(num1-num2);
        }
        else if (operator.equals("multiply")){
            return "The multiplication of " +num1+ " and " +num2+ " is: " +(num1*num2);
        }
        else
            return num1 + " divided by " +num2+ " is: " +(num1/num2);
    }

    /**
     * PUT method for updating or creating an instance of Calculate
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_XML)
    public void putXml(String content) {
    }
}
