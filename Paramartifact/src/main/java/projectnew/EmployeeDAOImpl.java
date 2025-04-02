package projectnew;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;


@Component
public class EmployeeDAOImpl implements IEmployeeDAO{
	
	
	@Autowired
	NamedParameterJdbcTemplate njt;
	
	@Autowired
	public EmployeeDAOImpl(NamedParameterJdbcTemplate njt) {
		this.njt=njt;
	}
	
	 public Employee getEmployee(int id) {
	    	
	    	System.out.println("emp viewed");
	    	
	    	String sql_qry="select * from employees where id = :id";
	    	
	    	MapSqlParameterSource parameters = new MapSqlParameterSource();
	    	parameters.addValue("id", id);
	    	
	        return njt.queryForObject(sql_qry, parameters, new EmployeeRowMapper());
	    }

	    	
	    
	    	

	   
	    public List<Employee> getAllEmployees()
	    {
	    	
	    	//jt.execute("select * from employees");
	    	
	    	
	    	
	    	System.out.println("Fetching all employees...");
	    	
	    	return njt.query("select * from employees", new EmployeeRowMapper());
	        
	    }
	    
	    public void updateSalary(int id, int salary) {
	    	
	    	String update_qry="update employees set salary= :salary where id = :id";
	    	
	    	MapSqlParameterSource map = new MapSqlParameterSource();
	    	
	    	map.addValue("id", id);
	    	map.addValue("salary", salary);
	    	
	    	njt.update(update_qry, map);
	    	
	    	
	    	System.out.println("salary updated for ID : "+id);
	    }

	    
	    public void deleteEmployee(int id) {
	        String sql = "delete from employees where id = :id";

	        MapSqlParameterSource parameters = new MapSqlParameterSource();
	        parameters.addValue("id", id);

	        njt.update(sql, parameters);

	        System.out.println("Employee deleted with ID: " + id);
	    }



	    public void addEmployee(Employee emp) {
	        String sql = "insert into employees (id, name, department, salary) VALUES (:id, :name, :department, :salary)";

	        MapSqlParameterSource insertions = new MapSqlParameterSource();
	        insertions.addValue("id", emp.getId());
	        insertions.addValue("name", emp.getName());
	        insertions.addValue("department", emp.getDepartment());
	        insertions.addValue("salary", emp.getSalary());

	        int changes = njt.update(sql,insertions );
	        
	        if(changes>0){
	        	System.out.println("New Employee has been added.!");
	        }
	        else  System.out.println("Employee insertion unsuccessfull!!!!");
	        	
	        
	    }

		

	}

		

		
		

		

	

	        
	
	