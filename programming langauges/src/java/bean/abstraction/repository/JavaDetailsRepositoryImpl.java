package java.bean.abstraction.repository;

import java.bean.abstraction.annotation.CustomAnnotation;
import java.bean.abstraction.entity.JavaDetails;

@CustomAnnotation
public class JavaDetailsRepositoryImpl implements JavaDetailsRepository {

	@Override
	public boolean save(JavaDetails entity) {
		return false;
	}

}
