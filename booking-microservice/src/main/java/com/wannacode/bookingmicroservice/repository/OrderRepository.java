package com.wannacode.bookingmicroservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wannacode.bookingmicroservice.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
