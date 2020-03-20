package de.fs.openapi;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("sample")
public class SampleResource {

    @POST
    @Path("one")
    public Response createOne(One one) {
        return Response.ok().build();
    }
}
