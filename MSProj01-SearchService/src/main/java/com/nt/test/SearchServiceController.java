package com.nt.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SearchServiceController {

	@GetMapping("/search")
	public String displayMsg() {
		return "Welcome to FlipKart serarch service";
	}
}
