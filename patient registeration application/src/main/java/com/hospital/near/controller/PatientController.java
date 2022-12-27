package com.hospital.near.controller;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hospital.near.entity.PatientEntity;
import com.hospital.near.service.PatientService;

@Component
@RequestMapping
public class PatientController {
 @Autowired
	private PatientService service;
	@PostMapping(path="/switch")
	public String onSend(PatientEntity entity,HttpServletRequest req) {
		boolean bool=service.saveandValiadte(entity);
		if(bool) {
			req.setAttribute("message", "value are saved");
			req.setAttribute("entity", entity);
			return "saveSuccess.jsp";
		}else {
			req.setAttribute("error", "value are not saved");
		}
		return "index.jsp";
	}
	@GetMapping(path="/name")
	public String search(@RequestParam String name, Model model) {
		Optional<List<PatientEntity>> optionalList=service.findByName(name);
		if(optionalList.isPresent() && optionalList.get().size()>0) {
			List<PatientEntity> list=optionalList.get();
			model.addAttribute("list", list);
			return "searchResult.jsp";
		}else {
			model.addAttribute("message", "value are not found");
			return "search.jsp";
		}
		
	}
	@GetMapping(path="/age")
	public String findByAgeGreaterThan(@RequestParam int age,Model model) {
		Optional<List<PatientEntity>> list1=service.findByAgeGreaterThan(age);
		if(list1.isPresent() && list1.get().size()>0) {
			model.addAttribute("list1", list1);
			return "searchResult.jsp";
		}else {
			model.addAttribute("message", "value are not found");
			return "search.jsp";
		}
	}
	@GetMapping(path="/age1")
	public String findByAgeLesserThan(@RequestParam int age,Model model) {
		Optional<List<PatientEntity>> list2=service.findByAgeLesserThan(age);
		if(list2.isPresent() && list2.get().size()>0) {
			model.addAttribute("list2", list2);
			return "searchResult.jsp";
		}else {
			model.addAttribute("message", "value are not found");
			return "search.jsp";
		}
	}
}
