package projectnew;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class EmployeeDAOImpl implements IEmployeeDAO {
	 
	JdbcTemplate jt;
	
	@Autowired
	public EmployeeDAOImpl(JdbcTemplate jt) {
		this.jt=jt;
	}
	
	public List<Employee>getAllEmployees()
	{
		System.out.println("Fetching all employees...");
		return jt.query("select * from employees", new EmployeeRowMapper());
	       
    }

   
    public void updateSalary(int id, int salary) {
   
    jt.update("update employees set salary= ? where id = ?",id,salary);
   
    System.out.println("salary updated for ID : "+id);
    }

   
    public void deleteEmployee(int id) {
       
    jt.update("delete from employees where id = ?",id);
   
    System.out.println("emp deleted with ID : "+id);
   
    }


public void addEmployee(Employee emp) {
jt.update("insert into employees values (?,?,?,?)",emp.getId(),emp.getName(),emp.getDepartment(),emp.getSalary());

jt.query("select * from employees", new BeanPropertyRowMapper<>(Employee.class));



System.out.println("Employee Added successfully!!");

}

public Employee getEmployee(int id) {
	// TODO Auto-generated method stub
	return jt.queryForObject("select * from employee where id = ?", new BeanPropertyRowMapper<>(Employee.class),id);
}
	

}
