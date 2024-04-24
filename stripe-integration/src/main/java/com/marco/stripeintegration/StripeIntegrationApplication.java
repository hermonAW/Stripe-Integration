package com.marco.stripeintegration;

import com.stripe.Stripe;
import jakarta.annotation.PostConstruct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StripeIntegrationApplication {

    @PostConstruct
    public void setup() {
        Stripe.apiKey = "sk_test_51MyKwgHIEsG8gydDyT938nQu9dzQ5A2PM57z6yPK4WTkJHW4SXkD9AGdBVj0Vfcb7pzrokPWgZ21yUmX9cZ1LFZz00eOttA60l";
    }

    public static void main(String[] args) {
        SpringApplication.run(StripeIntegrationApplication.class, args);
    }

}
