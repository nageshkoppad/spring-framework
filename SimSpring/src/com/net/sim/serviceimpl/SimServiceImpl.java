package com.net.sim.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.net.sim.dto.Sim;
import com.net.sim.repository.SimRepository;
import com.net.sim.repositoryimpl.SimRepositoryImpl;
import com.net.sim.service.SimService;

@Component
public class SimServiceImpl implements SimService 
{
@Autowired
@Qualifier("service")
private SimRepositoryImpl simRepository;

public SimServiceImpl() {
	super();
}

@Override
public SimRepositoryImpl validate() {
	return null;
}

@Override
public String toString() {
	return "SimServiceImpl [simRepository=" + simRepository + "]";
}
	
	

}
