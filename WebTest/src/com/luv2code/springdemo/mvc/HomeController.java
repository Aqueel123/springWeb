package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.luv2code.springdemo.mvc.bean.Employee;

@Controller
public class HomeController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String showPage(Model model) {
		model.addAttribute("employee", new Employee());
		return "main-menu";
	}
	
	@RequestMapping(value = "/processForm", method = RequestMethod.POST)
	public String processForm(@ModelAttribute("employee") Employee employee) {
		System.out.println("HomeController.processForm()"+ employee);
		if(employee.getUsername().equals(employee.getEmail())) {
		}
		return "main-menu";
	}
	
//	@RequestMapping("/")
//	public String showPage() {
//		return "main-menu";
//	}
}