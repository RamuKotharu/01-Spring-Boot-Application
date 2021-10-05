package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.OrderRequest;
import com.example.dto.OrderResponse;
import com.example.entities.Customer;
import com.example.entities.Product;
import com.example.repository.CustomerRepository;
import com.example.repository.ProductRepository;

@RestController
@RequestMapping("/api/v1/")
public class OrderController {
	
	@Autowired
	CustomerRepository customerRepository;
	
	@Autowired
	ProductRepository productRepository;
	
	@PostMapping("/placeOrder")
	public Customer placeOrder(@RequestBody OrderRequest orderRequest) {
		
		return customerRepository.save(orderRequest.getCustomer());
	}
	
	
	@GetMapping("/findAllOrders")
	public List<Customer> findAllOrders(){
		
		return customerRepository.findAll();
		
	}


	@GetMapping("/JoinInfo")
	public List<OrderResponse> findJoinInfo(){
		
		return customerRepository.getJoinInformation();
		
	}
}

