package org.svc1;

import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.jboss.resteasy.reactive.RestPath;
import org.svc1.clients.PaymentClient;
import org.svc1.entities.Payment;
import org.svc1.entities.User;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/user")
public class UserResource {
    @Inject
    @RestClient
    PaymentClient paymentClient;

    @POST
    @Transactional
    public void create(User user) {
        User.persist(user);
    }

    @GET
    @Path("/{userId}")
    @Produces("application/json")
    public User users(@RestPath Long userId) {
        return User.findById(userId);
    }

    @GET
    @Path("/users")
    @Produces("application/json")
    public List<User> users() {
        return User.listAll();
    }
}