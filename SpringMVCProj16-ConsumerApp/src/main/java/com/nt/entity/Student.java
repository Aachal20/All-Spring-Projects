package com.nt.entity;

import java.sql.Date;
import java.sql.Time;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;


import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class Student {

	
	private Integer sid;
	
	private String sname;
	
	private String addrs;
	
	private Float fees;
	
	
	private Date dob;
	
	private Time dot;
	
}
