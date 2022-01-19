package com.zensar.service;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


public interface OrderService {

	
	 public ResponseEntity<String> updateOrder( int id, String status);
	
}
