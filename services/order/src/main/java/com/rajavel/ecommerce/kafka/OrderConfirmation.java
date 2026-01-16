package com.rajavel.ecommerce.kafka;

import com.rajavel.ecommerce.customer.CustomerResponse;
import com.rajavel.ecommerce.order.PaymentMethod;
import com.rajavel.ecommerce.product.PurchaseResponse;

import java.math.BigDecimal;
import java.util.List;

public record OrderConfirmation (
        String orderReference,
        BigDecimal totalAmount,
        PaymentMethod paymentMethod,
        CustomerResponse customer,
        List<PurchaseResponse> products

) {
}
