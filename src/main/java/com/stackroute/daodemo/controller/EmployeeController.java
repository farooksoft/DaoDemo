package com.stackroute.daodemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.stackroute.daodemo.dao.EmployeeDao;
import com.stackroute.daodemo.model.Employee;




@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeDao employeeDao;
	@Autowired
	private Employee employee;
	
	@GetMapping("/")
	public String index(ModelMap model) {
		
		model.addAttribute("employees",employeeDao.getEmployees());
		return "index";
	}
	
	@PostMapping("/sendData")
	public String sendData(@RequestParam("empName") String name, @RequestParam("empDesig") String desig,ModelMap model) {
	
		employee.setEmpName(name);
		employee.setEmpDesig(desig);
		
		employeeDao.sendData(employee);
		List<Employee>   empList=   employeeDao.getEmployees();
		System.out.println("size:"+ empList.size());
		model.addAttribute("employees",empList);
		return "redirect:/";
		
	}
	
}
