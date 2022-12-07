package java.bean.abstraction.repository;

import java.bean.abstraction.annotation.CustomAnnotation;
import java.bean.abstraction.entity.CplusDetails;
@CustomAnnotation
public interface CplusDetailsRepository {
  boolean save(CplusDetails entity);
}
