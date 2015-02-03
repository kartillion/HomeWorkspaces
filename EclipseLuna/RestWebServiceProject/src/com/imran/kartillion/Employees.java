package com.imran.kartillion;

import javax.ws.rs.PathParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import com.imran.kartillion.model.Employee;

@Path("employees")
public class Employees {

	@GET
	public String getEmployeeNames(@QueryParam("sortBy") String sortedBy) {

		if (sortedBy == null) {
			throw new WebApplicationException(Response
					.status(Status.BAD_REQUEST)
					.header("x.error.message", "SortBy param is mandatory")
					.build());
		}
		return "Imran, Aziz sorted by " + sortedBy;
	}

	@GET
	@Path("id/{identifier:[0-9]}")
	public String getById(@PathParam("identifier") String myId) {
		return myId;
	}

	/*
	 * @GET
	 * 
	 * @Produces("text/xml") public Employee getXml(){ return new
	 * Employee(Integer.valueOf(1), "Imran"); }
	 * 
	 * @GET
	 * 
	 * @Produces("application/json") public Employee getJson(){ return new
	 * Employee(Integer.valueOf(1), "Imran"); }
	 * 
	 * @GET
	 * 
	 * @Path("status") public Response getResponse(){ return
	 * Response.notModified().build(); }
	 */

}
