package java.bean.abstraction.repository;

import java.bean.abstraction.annotation.CustomAnnotation;
import java.bean.abstraction.entity.PythonDetails;

@CustomAnnotation
public interface PythondetailsRepository {

	boolean save(PythonDetails entity);
}
