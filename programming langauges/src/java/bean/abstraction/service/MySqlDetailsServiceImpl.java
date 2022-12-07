package java.bean.abstraction.service;

import java.bean.abstraction.annotation.CustomAnnotation;
import java.bean.abstraction.entity.MySqlDetails;
import java.bean.abstraction.repository.MySqlDetailsRepositoryImpl;
@CustomAnnotation
public class MySqlDetailsServiceImpl implements MySqlDetailsService {

	MySqlDetailsRepositoryImpl impl;
	@Override
	public boolean saveAndvalidate(MySqlDetails entity) {
        impl.save(entity);
		return false;
	}

}
