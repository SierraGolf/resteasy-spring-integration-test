package com.codereligion.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/helloworld")
public interface HelloWorldResource {

    @GET
    @Path("/")
    @Produces(MediaType.TEXT_PLAIN)
    String talk();
}
