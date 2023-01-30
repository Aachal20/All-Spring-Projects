package com.nt.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.nt.entity.Student;

@Controller
@RequestMapping("/rest")
public class StudentConsumerController {

	
	private static final String List = null;
	@Autowired
	private RestTemplate template;
	
	
	@GetMapping("/")
	public String showHome() {
		System.out.println("StudentConsumerController.showHome()");
		//return LVN
		return "home";
	}
	
	@GetMapping("/student_report")
	public String  fetchAllStudent(Map<String,Object> map) throws Exception, JsonProcessingException {
		System.out.println("StudentConsumerController.fetchAllStudent()");
		/*//provider url : http://localhost:4040/student/getAll
		 * req mode: GET
		 * path variabble :no
		 * response content type : application/json(default)
		 * request header:no
		 * request body type:no
		 *  
		 * 
		//return LVN
		return "home";*/
		
		String serviceUrl = "http://localhost:4040/student/getAll";
		//invoke provide-RestController method/opeerations using exchange(-) of RestTemplate 
		ResponseEntity<String> entity = template.exchange(serviceUrl,HttpMethod.GET,null , String.class);
		//get json response from response object
		String body = entity.getBody();
		//convert Json body into List<Actor> object
		ObjectMapper mapper = new ObjectMapper();
		List<Student> readValue = mapper.readValue(body , new TypeReference<List<Student>>() {});
		//add result to map object(shared memory)
		map.put("studentsInfo" , readValue);
		//return LVN
		return "show_report";
	}
}
