package com.net.sim.dto;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Sim {
	@Value("25")
	private int id;
	@Value("prepaid")
	private String type;
	@Value("jio")
	private String operator;
	@Value("4554554gvbjk")
	private String imei;
	

	public Sim() {
		
	}
	
	@Override
	public String toString() {
		return "Sim [id=" + id + ", type=" + type + ", operator=" + operator + ", imei=" + imei + "]";
	}
	
}
