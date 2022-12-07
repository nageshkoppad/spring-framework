package com.net.sim.repositoryimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.net.sim.dto.Sim;
import com.net.sim.repository.SimRepository;
import com.net.sim.serviceimpl.SimServiceImpl;

@Component
public class SimRepositoryImpl implements SimRepository {
    
	@Autowired
	@Qualifier("sim")
	private Sim sim;
	public boolean create() {
	
		return false;
	}
	public SimRepositoryImpl() {
		super();
	}


	@Override
	public String toString() {
		return "SimRepositoryImpl [sim=" + sim + "]";
	}
}
