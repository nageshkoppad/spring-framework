package java.bean.abstraction.repository;

import java.bean.abstraction.annotation.CustomAnnotation;
import java.bean.abstraction.entity.MySqlDetails;

@CustomAnnotation
public interface MySqlDetailsRepository {
 boolean save(MySqlDetails entity);
}
