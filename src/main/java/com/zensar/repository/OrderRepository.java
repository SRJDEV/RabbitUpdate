package com.zensar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.zensar.entity.FulfilmentOrderEntity;


public interface OrderRepository extends JpaRepository<FulfilmentOrderEntity, Integer> {


}
