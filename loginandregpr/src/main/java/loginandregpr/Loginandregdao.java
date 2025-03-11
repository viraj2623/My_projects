package loginandregpr;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Loginandregdao {

	private static final String jdbc_url="jdbc:oracle:thin:@localhost:1521:xe";
	private static final String username="system";
	private static final String password="admin";
	
	
	private Connection getConnection() throws ClassNotFoundException, SQLException {
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		return DriverManager.getConnection(jdbc_url,username,password);
		
	}
	
	public int userRegister(Adminandstdmodel aandstdm) throws ClassNotFoundException, SQLException {
		
		String insert_qry="insert into maindata (name,username,password,email,role) values (?,?,?,?,?)";
	int rslt=0;
		
	
	try(Connection connection = getConnection();
			
			PreparedStatement preparedStatement = connection.prepareStatement(insert_qry)){
		
		preparedStatement.setString(1, aandstdm.getName());
		preparedStatement.setString(2, aandstdm.getUsername());
		preparedStatement.setString(3, aandstdm.getPassword());
		preparedStatement.setString(4, aandstdm.getEmail());
		preparedStatement.setString(5, aandstdm.getRole());
		
		rslt=preparedStatement.executeUpdate();
	} catch(SQLException e) {
		e.printStackTrace();
	}
	
		return rslt;
		
		
	}

	public String userValidate(String username, String password) throws SQLException, ClassNotFoundException {
		String role= null;
		
		String loginqry="select role from maindata where username = ? and password = ?";
		
		try(Connection connection =getConnection();
			PreparedStatement preparedStatement=connection.prepareStatement(loginqry)){
			
			
			preparedStatement.setString(1, username);
			preparedStatement.setString(2, password);
			
			ResultSet rs= preparedStatement.executeQuery();
			
			if(rs.next()) {
				role=rs.getString("role");
				
			}
			
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		return role;
		
		
	}
	
	 public List<Adminandstdmodel> getAllStudents() throws ClassNotFoundException, SQLException {
		   
		   
		   
	        List<Adminandstdmodel> students = new ArrayList<>();
	        String FETCH_STUDENTS_SQL = "SELECT id, name, email, phone, username FROM uRegister WHERE role = 'STUDENT'";

	        Connection connection = getConnection();
	       
	        try (PreparedStatement preparedStatement = connection.prepareStatement(FETCH_STUDENTS_SQL);
	             ResultSet rs = preparedStatement.executeQuery()) {

	            while (rs.next()) {
	            	Adminandstdmodel student = new Adminandstdmodel();
	                student.setId(rs.getInt("id"));
	                student.setName(rs.getString("name"));
	                student.setEmail(rs.getString("email"));
	                
	                student.setUsername(rs.getString("username"));
	                students.add(student);
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return students;
	    }
	
	

	
}
