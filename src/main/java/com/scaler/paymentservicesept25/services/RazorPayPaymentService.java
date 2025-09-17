package com.scaler.paymentservicesept25.services;

import org.springframework.stereotype.Service;

@Service("razorPayPaymentService")
public class RazorPayPaymentService implements PaymentService {
    @Override
    public String generatePaymentLink(String orderId) {
        return "RazorPay not supported yet";
    }
}
