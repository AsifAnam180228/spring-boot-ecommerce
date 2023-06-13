package com.asifanam.ecommerce.service;

import com.asifanam.ecommerce.dto.Purchase;
import com.asifanam.ecommerce.dto.PurchaseResponse;

public interface CheckoutService {
    PurchaseResponse placeOrder(Purchase purchase);
}
