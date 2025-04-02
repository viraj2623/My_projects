package projectnew;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
	
	public static void main(String[] args) {
	
		
	ApplicationContext cont = new AnnotationConfigApplicationContext(Config.class);
		
		EmployeeService es = (EmployeeService) cont.getBean("employeeService");
		
		Employee e= new Employee();
		
		e.setDepartment("IT");
		e.setId(73);
		e.setName("shubham");
		e.setSalary(75000);
		
		System.out.println(es.getAllEmployees());{
		
		}
		
		
	}

}
