package Task2;
public class Employee implements Employable
{
	private float _salary;

	public Employee(float salary)
	{
		_salary = salary;
	}
	
	public float getSalary() {
		return _salary;
	}

	public void setSalary(float salary) {
		_salary = salary;
	}
}
