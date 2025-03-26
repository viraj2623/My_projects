package First;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Mainapp {
	public static void main(String args[])
	{
		ApplicationContext asd=new AnnotationConfigApplicationContext(Config.class);
		
		EmpService es=(EmpService) asd.getBean(EmpService.class);
		
		es.getEmp(1);
		es.getEmp1(2);
	}

}
