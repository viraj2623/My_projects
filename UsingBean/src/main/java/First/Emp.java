package First;

public class Emp {
	private int id;
	private String name;
	private int Salary;
	
	public Emp(int id,String name,int Salary)
	{
		this.id=id;
		this.name=name;
		this.Salary=Salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return Salary;
	}
	public void setSalary(int salary) {
		Salary = salary;
	}
	
	

}
