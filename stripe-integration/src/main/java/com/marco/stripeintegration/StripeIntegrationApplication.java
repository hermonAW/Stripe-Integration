package com.marco.stripeintegration;

import com.stripe.Stripe;
import jakarta.annotation.PostConstruct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StripeIntegrationApplication {

    @PostConstruct
    public void setup() {
        Stripe.apiKey = "sk_test_";
    }

    public static void main(String[] args) {
        SpringApplication.run(StripeIntegrationApplication.class, args);
    }

}
