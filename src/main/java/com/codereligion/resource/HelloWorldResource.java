package com.codereligion.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * A "Hello world!" resources that does nothing more than giving back a plain text saying "Hello world!.
 * 
 * @author sgroebler
 * @since 02.12.2012
 */
@Path("/helloworld")
public interface HelloWorldResource {

	@GET
	@Path("/")
	@Produces(MediaType.TEXT_PLAIN)
	String talk();
}
