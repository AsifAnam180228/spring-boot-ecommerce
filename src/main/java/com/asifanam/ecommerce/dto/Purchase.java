package com.asifanam.ecommerce.dto;

import com.asifanam.ecommerce.entity.Address;
import com.asifanam.ecommerce.entity.Customer;
import com.asifanam.ecommerce.entity.Order;
import com.asifanam.ecommerce.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {
    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;
}
