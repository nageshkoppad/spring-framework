package java.bean.abstraction.service;

import java.bean.abstraction.annotation.CustomAnnotation;
import java.bean.abstraction.entity.CshorpDetails;
import java.bean.abstraction.repository.CshorpDetailsRepositoryImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
@CustomAnnotation
public class CshorpDetailsServiceImpl implements CshorpDetailsService {
@Autowired
@Qualifier("")
	CshorpDetailsRepositoryImpl impl;
	@Override
	public boolean saveAndvaliadte(CshorpDetails eantity) {
	impl.save(eantity);
		return false;
	}

}
