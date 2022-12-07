package java.bean.abstraction.service;

import java.bean.abstraction.annotation.CustomAnnotation;
import java.bean.abstraction.entity.JavaDetails;
import java.bean.abstraction.repository.JavaDetailsRepositoryImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@CustomAnnotation
public class JavaDetailsSerrviceImpl implements JavaDetailsService {

	@Autowired
	@Qualifier()
	JavaDetailsRepositoryImpl impl;
	
	@Override
	public boolean validateAndSave(JavaDetails entity) {
	    impl.save(entity);
		return false;
	}

}
