package com.yuriiselebynka.spring.springboot.spring_data_rest.dao;

import com.yuriiselebynka.spring.springboot.spring_data_rest.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

   //employees
}
