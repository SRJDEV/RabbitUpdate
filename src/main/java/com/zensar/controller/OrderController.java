package com.zensar.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.service.OrderService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;


@RestController
@RequestMapping("macy/orders")
public class OrderController {

	@Autowired
	 OrderService service;
	
	
	@PutMapping(value = "/{orderId}", consumes = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_PROBLEM_XML_VALUE }, produces = { MediaType.APPLICATION_JSON_VALUE,
					MediaType.APPLICATION_PROBLEM_XML_VALUE })
	
	public ResponseEntity<String> updateOrder(@PathVariable("orderId")int orderId,@RequestParam(value="status")String newStatus) {
		
		
	
		return service.updateOrder(orderId, newStatus);
	
	}
	
	
	
}
