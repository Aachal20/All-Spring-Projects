package com.nt.entity;

import java.sql.Date;
import java.sql.Time;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="STUDENT_TBL_REST")
@Data
public class Student {

	@Id
	@GeneratedValue
	private Integer sid;
	@Column(length=20)
	private String sname;
	@Column(length=20)
	private String addrs;
	//private  List<String> courses;
	private Float fees;
	//private Set<Long> phoneNumber;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date dob;
	@JsonFormat(pattern = "HH:mm:ss")
	private Time dot;
	//private Map<String,Long> studDetails;
	
}
