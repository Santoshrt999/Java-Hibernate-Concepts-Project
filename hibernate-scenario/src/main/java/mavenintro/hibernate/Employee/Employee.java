package mavenintro.hibernate.Employee;

public class Employee {
	private int empID;
	private String empNmae;
	private String empDept;
	private double Salary;
	public Employee(int empID, String empNmae, String empDept, int Salary) {
		
		
		// TODO Auto-generated constructor stub
	}
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getEmpNmae() {
		return empNmae;
	}
	public void setEmpNmae(String empNmae) {
		this.empNmae = empNmae;
	}
	public String getEmpDept() {
		return empDept;
	}
	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}
	public double getSalary() {
		return Salary;
	}
	public void setSalary(double salary) {
		Salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", empNmae=" + empNmae + ", empDept=" + empDept + ", Salary=" + Salary
				+ "]";
	}

}
