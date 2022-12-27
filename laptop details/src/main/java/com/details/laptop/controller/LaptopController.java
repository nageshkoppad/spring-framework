package com.details.laptop.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.details.laptop.entity.LaptopEntity;
import com.details.laptop.service.LaptopService;

@Component
@RequestMapping("/pass")
public class LaptopController {
  @Autowired
	private LaptopService service;
	public LaptopController() {
		System.out.println(getClass().getSimpleName());
	}
	@PostMapping
	public String onSend(LaptopEntity entity,HttpServletRequest req) {
		boolean bool=service.saveAndValidate(entity);
		if(bool) {
			req.setAttribute("message", "value are saved");
		}else {
			req.setAttribute("error", "value are not saved");
			req.setAttribute("entity",entity);
		}
		return "index.jsp";
	}
}
