package java.bean.abstraction.repository;

import java.bean.abstraction.annotation.CustomAnnotation;
import java.bean.abstraction.entity.CshorpDetails;

@CustomAnnotation
public interface CshorpDetailsrepository {
     boolean save(CshorpDetails entity);
}
