package projectnew;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EmployeeRowMapper implements RowMapper<Employee>{
	
	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
Employee emp = new Employee();
		
		emp.setId(Integer.parseInt(rs.getString("id")));
		emp.setDepartment(rs.getString("department"));
		emp.setName(rs.getString("name"));
		emp.setSalary(rs.getInt("salary"));
		return emp;
	}

}
