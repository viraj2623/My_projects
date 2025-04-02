package projectnew;

import java.util.List;

import org.springframework.stereotype.Component;


@Component
public interface IEmployeeDAO {
	
void addEmployee(Employee emp);
	
	Employee getEmployee(int id);
	
	 
	 
	 void updateSalary(int id, int salary);
	 
	 void deleteEmployee(int id);

	List<Employee> getAllEmployees();

}


