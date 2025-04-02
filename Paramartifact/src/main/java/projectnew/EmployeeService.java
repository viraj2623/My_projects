package projectnew;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	
	
	private IEmployeeDAO employeeDAO;
	
	@Autowired
	public EmployeeService (IEmployeeDAO iempDAO) {
		employeeDAO = iempDAO;
	}

	public Employee getEmployee(int id) {
		return employeeDAO.getEmployee(id);
	}


	public void addEmployee(Employee emp) {
		employeeDAO.addEmployee(emp);
	}


	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return employeeDAO.getAllEmployees();
	}
	
}
