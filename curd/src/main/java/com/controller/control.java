package com.controller;

 
	import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.matireal.material;
import com.service.service;

	@RestController
	@RequestMapping("/api/material")
	public class control {
	    @Autowired
	    private  service serv;

	    @GetMapping
	    public List<material> getAllmaterials() 
	    {
	        return serv.findAll();
	    }

	    @PostMapping
	    public material addmaterial(@Value(value = "") @RequestBody material mate)
	    {
	        return serv.save(mate);
	    }

	    @PutMapping("/{id}")
	    public material updatematerial(@PathVariable Long id, @Value(value = "") @RequestBody material mate) {
	        return serv.save(mate);
	    }

	    @DeleteMapping("/{id}")
	    public void deletematerial(@PathVariable Long id) {
	    	serv.deleteById(id);
	    }
	}
 
