package com.xworkz.bikes.controller;

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

import com.xworkz.bikes.entity.BikesEntity;
import com.xworkz.bikes.service.BikeService;

@Component
@RequestMapping("/send")
public class Controller {
	
	@Autowired
	private BikeService bike;
	
	public Controller() {
		System.out.println(getClass().getSimpleName());
	}
	
	@PostMapping
	public String onClick(BikesEntity entity, HttpServletRequest request) {
		System.out.println("executed");
		boolean validateAndSave = bike.saveAndValidate(entity);
		if (validateAndSave) {
			request.setAttribute("message", "values  saved");
			request.setAttribute("entity", entity);
			System.out.println(entity);
		} else {
			request.setAttribute("error", "value are not saved");
		}
		return "index.jsp";
	}
	@GetMapping
	public String findByLocation(@RequestParam String location,Model model) {
		Optional<List<BikesEntity>> optional=this.bike.findByLocation(location);
		if(optional.isPresent() && optional.get().size()>0) {
			System.out.println("data is present");
		 List<BikesEntity> list=optional.get();
		 model.addAttribute("list", list);
			return "searchResult.jsp";
		}else{
			model.addAttribute("message", "no value found");
			return "search.jsp";
		}
	}

}
