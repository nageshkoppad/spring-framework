package java.bean.abstraction.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import org.springframework.stereotype.Component;
@Component
@Retention(RetentionPolicy.RUNTIME)
public @interface CustomAnnotation {

}
