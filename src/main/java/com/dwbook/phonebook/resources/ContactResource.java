package com.dwbook.phonebook.resources;

import com.dwbook.phonebook.dao.ContactDao;
import com.dwbook.phonebook.representation.Contact;
import org.skife.jdbi.v2.DBI;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/contacts")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ContactResource {
    private final ContactDao contactDao;

    public ContactResource(DBI jdbi) {
        contactDao = jdbi.onDemand(ContactDao.class);
    }

    @GET
    @Path("/{id}")
    public Response getContact(@PathParam("id") int id) {
        // get contact identified by id
        Contact contact = contactDao.getContactById(id);

        return Response.ok(contact).build();
    }

    @POST
    public Response createContact(Contact contact) {
        // create and store contact

        //return Response.created(null).build();
        return Response.status(Response.Status.CREATED).entity(contact).build();
    }

    @DELETE
    public Response deleteContact(@PathParam("id") int id) {
        // delete contact

        return Response.noContent().build();
    }

    @PUT
    @Path("/{id}")
    public Response updateContact(@PathParam("id") int id,
                                  Contact contact) {
        // update contact
        //return Response.ok().build();
        return Response.status(Response.Status.OK).entity(contact).build();
    }
}

