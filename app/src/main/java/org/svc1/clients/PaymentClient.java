package org.svc1.clients;

import io.quarkus.runtime.annotations.RegisterForReflection;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import org.jboss.resteasy.annotations.jaxrs.PathParam;
import org.svc1.entities.Payment;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/payment")
@RegisterRestClient
public interface PaymentClient {
    @Path("/{userId}")
    @GET
    @Produces("application/json")
    Payment getByUserId(@PathParam Integer userId);
}
