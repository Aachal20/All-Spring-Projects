package com.nt.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

	private Integer cno;
	private String cname;
	
	private List<Company> compinesList;
	//@JsonFormat(pattern = "yyyy-MM-dd")
	@JsonFormat(pattern = "MM-dd-yyyy")
	private LocalDate dob;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private LocalDateTime purchaseDate;
	
	private List<Map<String,Object>> familyIds;
	
	private Address addrs;
}
