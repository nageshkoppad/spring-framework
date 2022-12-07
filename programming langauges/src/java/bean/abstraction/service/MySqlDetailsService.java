package java.bean.abstraction.service;

import java.bean.abstraction.annotation.CustomAnnotation;
import java.bean.abstraction.entity.MySqlDetails;
@CustomAnnotation
public interface MySqlDetailsService {
 boolean saveAndvalidate(MySqlDetails entity);
}
