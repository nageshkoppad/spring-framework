package com.shop.mobile.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.shop.mobile.entity.MobileEntity;
import com.shop.mobile.service.MobileService;

@Component
@RequestMapping("/connect")
public class MobileController {
  @Autowired
	private MobileService service;
	public MobileController() {
		System.out.println(getClass().getSimpleName());
	}
	@PostMapping
	public String onSend(MobileEntity entity,HttpServletRequest req) {
		boolean bool=service.saveAndValidate(entity);
		if(bool) {
			req.setAttribute("message","value are saved");
		}else {
			req.setAttribute("error", "value are not saved");
			req.setAttribute("entity", entity);
		}
		return "index.jsp";
	}
}
