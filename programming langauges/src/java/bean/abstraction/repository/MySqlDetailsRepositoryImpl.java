package java.bean.abstraction.repository;

import java.bean.abstraction.annotation.CustomAnnotation;
import java.bean.abstraction.entity.MySqlDetails;
@CustomAnnotation
public class MySqlDetailsRepositoryImpl implements  MySqlDetailsRepository {

	@Override
	public boolean save(MySqlDetails entity) {
		return false;
	}

}
