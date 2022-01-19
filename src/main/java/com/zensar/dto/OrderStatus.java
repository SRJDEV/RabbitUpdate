package com.zensar.dto;

public class OrderStatus {
	
	ProducerMessageDTO producerMessageDTO;
	String status = "";//confirmed,shipped
	
	public OrderStatus(ProducerMessageDTO producerMessageDTO, String status) {
		super();
		this.producerMessageDTO = producerMessageDTO;
		this.status = status;
	}

	public ProducerMessageDTO getProducerMessageDTO() {
		return producerMessageDTO;
	}

	public void setProducerMessageDTO(ProducerMessageDTO producerMessageDTO) {
		this.producerMessageDTO = producerMessageDTO;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public OrderStatus() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
