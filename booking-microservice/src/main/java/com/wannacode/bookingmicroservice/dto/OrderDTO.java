package com.wannacode.bookingmicroservice.dto;

import java.util.List;

import com.wannacode.bookingmicroservice.entity.OrderItem;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class OrderDTO {
    private List<OrderItem> orderItems;
}
