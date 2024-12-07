package com.klef.jfsd.springboot.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.klef.jfsd.springboot.model.model1;
import com.klef.jfsd.springboot.repository.jparepo;

@RestController
public class cuscontroller {
	@Autowired
	private jparepo repo;

	@GetMapping("/viewallcus")
	public List<model1> viewallcus(){
		return repo.findAll();
	}

}
