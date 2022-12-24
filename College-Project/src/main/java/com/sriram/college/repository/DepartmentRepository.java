package com.sriram.college.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sriram.college.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department,Integer> {

}
