package com.example.demo2;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TestControllel {

	@RequestMapping(value = "/hello")
	public List<String> hello(){
		List<String> strings = new ArrayList<>();
		strings.add("heee");
		strings.add("eafea");
		return strings;
	}

}
