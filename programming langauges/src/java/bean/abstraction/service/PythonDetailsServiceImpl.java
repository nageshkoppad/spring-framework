package java.bean.abstraction.service;

import java.bean.abstraction.annotation.CustomAnnotation;
import java.bean.abstraction.entity.PythonDetails;
import java.bean.abstraction.repository.PythonDetailsRepositoryImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
@CustomAnnotation
public class PythonDetailsServiceImpl implements PythonDetailsService {

	@Autowired
	@Qualifier
	PythonDetailsRepositoryImpl impl;
	
	@Override
	public boolean saveAndvaliadate(PythonDetails entity) {
	impl.save(entity);
		return false;
	}

}
