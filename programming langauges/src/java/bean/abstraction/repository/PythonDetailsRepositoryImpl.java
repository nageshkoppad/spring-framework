package java.bean.abstraction.repository;

import java.bean.abstraction.annotation.CustomAnnotation;
import java.bean.abstraction.entity.PythonDetails;

@CustomAnnotation
public class PythonDetailsRepositoryImpl implements PythondetailsRepository {

	@Override
	public boolean save(PythonDetails entity) {
	
		return false;
	}

}
