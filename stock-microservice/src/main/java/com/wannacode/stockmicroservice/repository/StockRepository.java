package com.wannacode.stockmicroservice.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wannacode.stockmicroservice.entity.StockEntity;

public interface StockRepository extends JpaRepository<StockEntity, Long> {
    Optional<StockEntity> findByCode(String code);
}
