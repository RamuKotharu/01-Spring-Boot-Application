package com.example.dto;



import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(content = Include.NON_DEFAULT)
public class OrderResponse {

	private String name;
	private String productName;
	private int price;
	
	public OrderResponse(String name, String productName) {
		this.name = name;
		this.productName = productName;
	}
	
}
