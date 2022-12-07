package java.bean.abstraction.service;

import java.bean.abstraction.annotation.CustomAnnotation;
import java.bean.abstraction.entity.JavaDetails;
@CustomAnnotation
public interface JavaDetailsService {
   boolean validateAndSave(JavaDetails entity);
}
