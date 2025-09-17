package com.scaler.paymentservicesept25.services;

import com.stripe.exception.StripeException;

public interface PaymentService {
    String generatePaymentLink(String orderId) throws StripeException;
}
