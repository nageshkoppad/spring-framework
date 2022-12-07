package java.bean.abstraction.repository;

import java.bean.abstraction.annotation.CustomAnnotation;
import java.bean.abstraction.entity.JavaDetails;
@CustomAnnotation
public interface JavaDetailsRepository {
   boolean save(JavaDetails entity);
}
