package org.example;

import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;
import lombok.NonNull;

@Path("test")
public class TestResource {

    @POST
    public Response testResource(@NonNull final String requestBody) {
        System.out.println(requestBody);

        return Response.accepted().build();
    }
}
