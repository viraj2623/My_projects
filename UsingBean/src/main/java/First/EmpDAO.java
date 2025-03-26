package First;

import org.springframework.stereotype.Component;

@Component
public class EmpDAO implements IEmp{

	public Emp getEmp(int id) {
		System.out.println("Kuch Bhi...!");
		return null;
		
	}
	
	public void getEmp1(int id)
	{
		System.out.println("GET Method...!");

	}
}
