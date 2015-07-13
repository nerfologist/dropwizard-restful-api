package com.dwbook.phonebook.resources;

import com.dwbook.phonebook.representation.Contact;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/contacts")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ContactResource {

    @GET
    @Path("/{id}")
    public Response getContact(@PathParam("id") int id) {
        // get contact identified by id

        return Response.ok(new Contact(id, "Mario", "Rossi", "+39 3482794553")).build();
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

        return Response.status(Response.Status.OK).entity(contact).build();
    }
}

