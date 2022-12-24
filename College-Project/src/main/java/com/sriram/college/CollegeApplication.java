package com.sriram.college;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sriram.college.entity.Department;
import com.sriram.college.service.DepartmentService;

@SpringBootApplication
public class CollegeApplication implements CommandLineRunner {

	Logger logger = LoggerFactory.getLogger(CollegeApplication.class);
	
	@Autowired
	DepartmentService service;
	public static void main(String[] args) {
		SpringApplication.run(CollegeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		List<Department> allDept = service.getAllDepartments();
		
		String url ="https://www.gniotgroup.edu.in/blog/wp-content/uploads/2021/07/unnamed-1280x720.jpg";
		service.addDepartment(1, "Computer Science and Engineering", "Kumar", url);
		for(Department dept: allDept) {
			logger.info(dept.toString());
		}
		
		
	}

}
