package com.Ashok.Employee.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Ashok.Employee.Entity.Employee;
import com.Ashok.Employee.Service.EmployeeService;

@RestController
@RequestMapping(value = "/Employee")
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;

	@RequestMapping(method = RequestMethod.POST)
	public Employee createemployee(@RequestBody Employee pEmployee) {
		return employeeService.createemployee(pEmployee);
	}

	@RequestMapping(value = "/id", method = RequestMethod.GET)
	public Employee getEmployee(@RequestParam Integer id) {
		return employeeService.getEmployee(id);
	}

	@RequestMapping(value = "/id", method = RequestMethod.GET)
	public List<Employee> getAll() {
		return employeeService.getAll();
	}
}