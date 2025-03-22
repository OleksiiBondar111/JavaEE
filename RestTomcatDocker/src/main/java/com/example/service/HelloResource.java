package com.example.service;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class HelloResource {
    
     private static final Logger logger = LoggerFactory.getLogger(HelloResource.class);

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String sayHello() {
        logger.info("Hello from Tomcat REST Service running in Docker!");
        return "Hello from Tomcat REST Service running in Docker!";
    }
}
