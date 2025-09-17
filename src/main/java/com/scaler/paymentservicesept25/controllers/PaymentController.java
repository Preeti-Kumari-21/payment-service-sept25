package com.scaler.paymentservicesept25.controllers;

import com.scaler.paymentservicesept25.services.PaymentService;
import com.stripe.exception.StripeException;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payments")
public class PaymentController {

    private PaymentService paymentService;

    public PaymentController(@Qualifier("stripePaymentService") PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping("/initiate/{orderId}") //http://localhost:8083/payments/initiate/{}
    public String generatePaymentLink(@PathVariable("orderId") String orderId) throws StripeException {
        //Call the order service to get the order details, this will not be implmeented so think hypothetically
        return paymentService.generatePaymentLink(orderId);
    }
}
