package java.bean.abstraction.service;

import java.bean.abstraction.annotation.CustomAnnotation;
import java.bean.abstraction.entity.CplusDetails;
import java.bean.abstraction.repository.CplusDetailsRepositroyImpl;
import java.bean.abstraction.repository.JavaDetailsRepositoryImpl;

import org.springframework.beans.factory.annotation.Autowired;
@CustomAnnotation
public class CplusDetailsServiceImpl implements CplusDetailsService {

	@Autowired
	CplusDetailsRepositroyImpl  impl;
	
	@Override
	public boolean validateAndsave(CplusDetails entity) {
		impl.save(entity);
		return false;
	}

}
