package com.Ashok.Employee.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Ashok.Employee.Entity.Employee;
import com.Ashok.Employee.Repositiory.EmployeeRepositiory;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	EmployeeRepositiory employeeRepositiory;

	@Override
	public Employee createemployee(Employee pEmployee) {
		
		return employeeRepositiory.save(pEmployee);
	}

	@Override
	public Employee getEmployee(Integer id) {
		return employeeRepositiory.findById(id).get();
	}

	@Override
	public List<Employee> getAll() {
		return employeeRepositiory.findAll();
	}

}
