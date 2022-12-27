package com.xworkz.stops.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.stops.entity.BusEntity;
import com.xworkz.stops.service.BusService;

@Component
@RequestMapping("/send")
public class BusController {
@Autowired
	private BusService serv;
	
	public BusController() {
		System.out.println(getClass().getSimpleName());
	}
	@PostMapping
	public String onSend(BusEntity entity,HttpServletRequest req) {
		System.out.println("executing succesfully");
		boolean bool=serv.saveAndValidate(entity);
		if(bool) {
			req.setAttribute("message", "value are saved");
			System.out.println(entity);
		}else {
			req.setAttribute("error", "value are not saved");
			req.setAttribute("entity", entity);
		}
		return  "index.jsp";
	}
}
