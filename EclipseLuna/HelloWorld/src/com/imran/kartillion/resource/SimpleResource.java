package com.imran.kartillion.resource;

import java.util.List;

import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;

import com.imran.kartillion.model.MyUser;

@Path("simple")
public class SimpleResource {
    @SuppressWarnings("unused")
    @Context
    private UriInfo context;
    
    @PersistenceUnit
    EntityManagerFactory emf;

    /**
     * Default constructor. 
     */
    public SimpleResource() {
        // TODO Auto-generated constructor stub
    }

    /**
     * Retrieves representation of an instance of SimpleResource
     * @return an instance of String
     */
    @GET
    @Produces("application/xml")
    public String getXml() {
        // TODO return proper representation object
    	/*List userList = emf.createEntityManager().createQuery("select u from MyUser u").getResultList();
		MyUser user;
		for (int i=0; i<userList.size(); i++){
			user =  (MyUser) userList.get(i);
			out.print("<h2>Username: " + user.getName() + "</h2>");
		}*/
        return "<greetings>Hello: " +((MyUser)(emf.createEntityManager().createQuery("select u from MyUser u").getResultList().get(0))).getName()+ "</greetings>";
    }

    /**
     * PUT method for updating or creating an instance of SimpleResource
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
    @PUT
    @Consumes("application/xml")
    public void putXml(String content) {
    }

}