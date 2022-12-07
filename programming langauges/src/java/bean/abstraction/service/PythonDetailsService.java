package java.bean.abstraction.service;

import java.bean.abstraction.annotation.CustomAnnotation;
import java.bean.abstraction.entity.PythonDetails;

@CustomAnnotation
public interface PythonDetailsService {
  boolean saveAndvaliadate(PythonDetails entity);
}
