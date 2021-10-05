package org.svc2;

import org.jboss.resteasy.reactive.RestPath;
import org.svc2.entities.Payment;

import javax.transaction.Transactional;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/payment")
public class PaymentResource {

    @GET
    @Path("/{userId}")
    @Produces("application/json")
    public Payment find(@RestPath Integer userId) {
        return Payment.findByUserId(userId);
    }

    @POST
    @Transactional
    public void create(Payment payment) {
        Payment.persist(payment);
    }
}