package com.Ashok.Employee.Repositiory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Ashok.Employee.Entity.Employee;

public interface EmployeeRepositiory extends JpaRepository<Employee, Integer> {

}
