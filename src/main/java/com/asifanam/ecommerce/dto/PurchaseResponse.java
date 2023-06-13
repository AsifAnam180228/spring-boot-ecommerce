package com.asifanam.ecommerce.dto;

import lombok.Data;
import lombok.NonNull;

@Data
public class PurchaseResponse {
//    @NonNull //Can also use this instead of final
    private final String orderTrackingNumber;
}
