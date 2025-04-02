package projectnew;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages ="projectnew")
public class Config {
	
	@Bean
	public DriverManagerDataSource myds(){
		
DriverManagerDataSource dmd = new DriverManagerDataSource();
		
		dmd.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		dmd.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		dmd.setUsername("system");
		dmd.setPassword("admin");
		
		return dmd;

	
	}
	
	@Bean
	public NamedParameterJdbcTemplate namedParameterJdbcTemplate(DriverManagerDataSource myds)
	
 {
		return new NamedParameterJdbcTemplate(myds);
		
		
	}
	
	
}


