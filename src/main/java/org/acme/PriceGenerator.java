package org.acme;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import org.eclipse.microprofile.reactive.messaging.Channel;
import org.eclipse.microprofile.reactive.messaging.Emitter;

import java.util.Random;

@Path("/prices")
public class PriceGenerator {

    @Channel("price-out")
    Emitter<Double> priceEmitter;

    private final Random random = new Random();

    @GET
    public String generate() {
        for (int i = 0; i < 15; i++) {
            priceEmitter.send(random.nextDouble() * 120);
        }
        return "17 prices sent";
    }
}