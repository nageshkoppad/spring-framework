package java.bean.abstraction.service;

import java.bean.abstraction.annotation.CustomAnnotation;
import java.bean.abstraction.entity.CplusDetails;

@CustomAnnotation
public interface CplusDetailsService {

	boolean validateAndsave(CplusDetails entity);
}
