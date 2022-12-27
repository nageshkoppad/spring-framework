package www.search.places.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Component
@ComponentScan("www.search")
public class VisiteConfiguration {

	public VisiteConfiguration() {
		System.out.println(getClass().getSimpleName());
	}
	@Bean
	public LocalContainerEntityManagerFactoryBean localentity() {
		LocalContainerEntityManagerFactoryBean local=new LocalContainerEntityManagerFactoryBean();
      local.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
		return local;
	}
	@Bean
	public ViewResolver viewResolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver("/", ".jsp");
		return resolver;
	}
}
