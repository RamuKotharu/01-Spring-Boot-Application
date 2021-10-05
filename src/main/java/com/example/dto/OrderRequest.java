package com.example.dto;

import com.example.entities.Customer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class OrderRequest {

	private Customer customer; 
}
