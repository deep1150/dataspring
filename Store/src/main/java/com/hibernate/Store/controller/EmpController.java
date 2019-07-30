package com.hibernate.Store.controller;

import java.util.Optional;

import javax.servlet.http.HttpServletMapping;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.hibernate.Store.model.Employee;
import com.hibernate.Store.repositary.EmpRepositary;

//@RestController
@Controller
public class EmpController {
	
	@Autowired
	private EmpRepositary empRepositary;

	@RequestMapping("/")
	public String get()
	{
		return "Home";
	}

@ResponseBody
@RequestMapping("/All")
public String getAll()
{
	
			return empRepositary.findAll().toString();
}
//@ResponseBody
@RequestMapping("/h")	
public String letsShoutDude(HttpServletRequest request, Model model) {
	return "hello";
}
@ResponseBody
@RequestMapping("/addEmp")

public String addEmp(Employee e)
{
	empRepositary.save(e);
	return "data is added";
}



/*
@RequestMapping("/getEmp")
public ModelAndView getEmp(@RequestParam int id)
{
	Optional<Employee> e;
	ModelAndView mv =new ModelAndView("getd");
	e=empRepositary.findById(id);
	mv.addObject(e);
	return mv;
}
@RequestMapping("/one")
public String getone(@RequestParam int Id)
{
	
			return empRepositary.findById(Id).toString();
}

*/

}
