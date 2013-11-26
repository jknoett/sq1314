package Task2;
public class EmployedStudent extends Student implements Employable
{
	private Employable _employee;
	
	public EmployedStudent(String name, int unNumber, Employable employee)
	{
		super(name, unNumber);
		_employee = employee;
	}
	
	public int getUnNumber() {
		return super.getUnNumber();
	}
	
	public void setUnNumber(int unNumber) {
		super.setUnNumber(unNumber);
	}
	
	public float getSalary() {
		return _employee.getSalary();
	}
	
	public void setSalary(float salary) {
		_employee.setSalary(salary);
	}
}
