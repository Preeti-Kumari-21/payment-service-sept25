package com.scaler.paymentservicesept25.services;

import org.springframework.stereotype.Service;

@Service("phonePePaymentService")
public class PhonePePaymentService implements PaymentService {
    @Override
    public String generatePaymentLink(String orderId) {
        return "PhonePay not supported yet";
    }
}
