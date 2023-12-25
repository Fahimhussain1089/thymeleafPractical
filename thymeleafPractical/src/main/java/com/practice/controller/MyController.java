package com.practice.controller;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
	
	//@RequestMapping(value = "/about" , method = RequestMethod.GET)
	@GetMapping("/about")
	public String about(Model model) {
		System.out.println("INSIDE ABOUT HANDLER");
		
		model.addAttribute("name", "NAME APNE PASAND KE RAKH LO");
		
		model.addAttribute("curentDate",new Date().toLocaleString());
		
		return("about");
	}
	@GetMapping("/example-loop")
	public String iteratHandler(Model m) {
		//CREATE LIST AND  SET COLLECTION
		List<String> names =  List.of("Ankit","Laxmi","Karn","John");
		
		m.addAttribute("names",names);
		
		
		return "iterate";
	}
	//handler for conditional statements
	@GetMapping("/condition")
	public String conditionHandler(Model m)
	{
		System.out.println("conditional handler excuted......");
		m.addAttribute("isActive", false); //ye direct html file ke active part pe efect kr rhe hai
		m.addAttribute("gender","F");
		
		List<Integer> list = List.of(12);
		m.addAttribute("mylist",list);
		return "condition";
	}
	 //hander for including fragments
	@GetMapping("/service")
	public String servicesHandler(Model m)
	{
		m.addAttribute("title","I LIKE TO EAT SAMOSA");
		m.addAttribute("subtitle",LocalDateTime.now().toString());
		
		return "service";
	}
	//for new about
	@GetMapping("/newabout")
	public String newAbout() {
		return "aboutnew";
	}
	//for contact
		@GetMapping("/contact")
		public String contact() {
			return "contact";
		}
		
	
}
