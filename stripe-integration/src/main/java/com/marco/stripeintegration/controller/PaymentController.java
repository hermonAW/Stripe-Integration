package com.marco.stripeintegration.controller;

import com.marco.stripeintegration.dto.CreatePayment;
import com.marco.stripeintegration.dto.CreatePaymentResponse;
import com.stripe.exception.StripeException;
import com.stripe.model.PaymentIntent;
import com.stripe.param.PaymentIntentCreateParams;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {

    @PostMapping("/create-payment-intent")
    public CreatePaymentResponse createPayment(@RequestBody CreatePayment createPayment) throws StripeException {
        PaymentIntentCreateParams createParams = new PaymentIntentCreateParams.Builder()
                .setCurrency("usd")
                .setAmount(15 * 100L)
                .build();

        PaymentIntent intent = PaymentIntent.create(createParams);
        return new CreatePaymentResponse(intent.getClientSecret());


    }
}
