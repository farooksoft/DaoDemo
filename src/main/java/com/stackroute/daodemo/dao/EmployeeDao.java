package com.stackroute.daodemo.dao;

import java.util.List;

import com.stackroute.daodemo.model.Employee;

public interface EmployeeDao {
	public List<Employee> getEmployees();
	public boolean sendData(Employee employee);
}
