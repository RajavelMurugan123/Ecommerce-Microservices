package com.rajavel.ecommerce.payment;

import com.rajavel.ecommerce.customer.CustomerResponse;
import com.rajavel.ecommerce.order.PaymentMethod;

import java.math.BigDecimal;

public record PaymentRequest(
        BigDecimal amount,
        PaymentMethod paymentMethod,
        Integer orderId,
        String orderReference,
        CustomerResponse customer
) {
}
