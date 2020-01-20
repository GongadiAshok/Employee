package com.Ashok.Employee.Service;

import java.util.List;

import com.Ashok.Employee.Entity.Employee;

public interface EmployeeService {

	Employee createemployee(Employee pEmployee);

	Employee getEmployee(Integer id);

	List<Employee> getAll();

}
