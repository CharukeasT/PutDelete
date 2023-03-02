package com.example.sample.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.sample.Repository.repository;
import com.example.sample.Table.student;

@RestController
public class controller {
	@Autowired
	repository r;
	@PostMapping("/post")
	public student postDetails(@RequestBody student s) {
		return r.save(s);
	}
	@GetMapping("/get/{id}")
	public Optional<student> getDetailsById(int id){
		return r.findById(id);
	}
	@GetMapping("/get")
	public List<student> getDetails(){
		return r.findAll();
	}
	@PutMapping("/put/{id}")
	public student putDetails(@RequestBody student s) {
		return r.saveAndFlush(s);
				
	}
	@DeleteMapping("/delete/{id}")
	public Boolean deleteDetails(int id) {
		r.deleteById(id);
		return true;
		
	}
}	
