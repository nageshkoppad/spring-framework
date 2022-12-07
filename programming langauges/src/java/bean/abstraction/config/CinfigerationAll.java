package java.bean.abstraction.config;

import java.bean.abstraction.repository.CplusDetailsRepositroyImpl;
import java.bean.abstraction.repository.CshorpDetailsRepositoryImpl;
import java.bean.abstraction.repository.JavaDetailsRepositoryImpl;
import java.bean.abstraction.repository.MySqlDetailsRepositoryImpl;
import java.bean.abstraction.repository.PythonDetailsRepositoryImpl;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("java.bean")
public class CinfigerationAll {

	@Bean
	public JavaDetailsRepositoryImpl impl() {
		return new JavaDetailsRepositoryImpl();
	}
	@Bean
	public CplusDetailsRepositroyImpl cplus() {
		
		return new CplusDetailsRepositroyImpl();
	}
	@Bean
	public PythonDetailsRepositoryImpl python() {
		return new PythonDetailsRepositoryImpl();
	}
	@Bean
	public MySqlDetailsRepositoryImpl mysql() {
		return new MySqlDetailsRepositoryImpl();
	}
	@Bean
	public CshorpDetailsRepositoryImpl shorp() {
		return new CshorpDetailsRepositoryImpl();
	}
	
}
