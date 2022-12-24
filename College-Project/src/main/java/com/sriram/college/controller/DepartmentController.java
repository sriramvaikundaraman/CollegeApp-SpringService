package com.sriram.college.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sriram.college.entity.Department;
import com.sriram.college.repository.DepartmentRepository;
import com.sriram.college.service.DepartmentService;

@Controller
@ResponseBody
@RequestMapping("/api")
@CrossOrigin(origins="http://localhost:8080")
public class DepartmentController {
	@Autowired
	private DepartmentRepository repo;
	
	@Autowired
	private DepartmentService service;
	
	@GetMapping("/all")
	public List<Department> findAll(){
		return service.getAllDepartments();
	}
	
	@PostMapping(path ="/add", consumes = {MediaType.APPLICATION_JSON_VALUE})
	public void saveDept(@RequestBody Department dept)
	{
		repo.save(dept);
	}

}
