package com.zensar.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.zensar.entity.FulfilmentOrderEntity;
import com.zensar.repository.OrderRepository;

@Service
public class OrderServiceImp implements OrderService {

	@Autowired
	OrderRepository repo;

	@Override
	public ResponseEntity<String> updateOrder(int id, String status) {

		FulfilmentOrderEntity entity = repo.getById(id);

		// considering status code 100 for confirmed,
		// 110 - CREATED, 120 - Shipped

		if (status.equalsIgnoreCase("Confirmed") || status.equalsIgnoreCase("Shipped")) {
			if (status.equalsIgnoreCase("Confirmed")) {
				entity.setorderStatusCode(100);
				entity.setOrderStatusStr(status);

			} else if (status.equalsIgnoreCase("Shipped")) {
				entity.setorderStatusCode(120);
				entity.setOrderStatusStr(status);

			}
			repo.save(entity);
			return new ResponseEntity<String>("Record updated Successfully", HttpStatus.OK);
		}else {
			return new ResponseEntity<String>("Invalid Status",HttpStatus.BAD_REQUEST);
		}

		
	}

}
