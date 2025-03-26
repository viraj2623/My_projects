package First;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
	
	@Bean
	public EmpDAO empDAO()
	{
		return new EmpDAO();
	}
	@Bean
	public EmpService empService(EmpDAO empDAO)
	{
		return new EmpService(empDAO);
	}
}
