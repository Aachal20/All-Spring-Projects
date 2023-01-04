package com.nt.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {

	private String houseNo;
	private String streetName;
	private String loc;
	private Integer pinCode;
	
}
