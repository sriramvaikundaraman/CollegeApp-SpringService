package com.sriram.college.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.sriram.college.entity.Department;
import com.sriram.college.repository.DepartmentRepository;

@Component
@Service
public class DepartmentService {
	@Autowired
	DepartmentRepository repo;
		
	public void addDepartment(int id, String title, String hod, String image)
	{
		Department dept = new Department(id,title,hod,image);
		repo.save(dept);
	}
	
	public List<Department> getAllDepartments(){
		return repo.findAll();
	}
}
