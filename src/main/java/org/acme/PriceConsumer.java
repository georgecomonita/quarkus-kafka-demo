package org.acme;

import jakarta.enterprise.context.ApplicationScoped;
import org.eclipse.microprofile.reactive.messaging.Incoming;
import org.jboss.logging.Logger;

@ApplicationScoped
public class PriceConsumer {

    private static final Logger LOG = Logger.getLogger(PriceConsumer.class);

    @Incoming("price-in")
    public void consume(double price) {
        LOG.infof("Received price: %.2f", price);
    }
}