package Task2;
public class App 
{
	public static void main(String[] args)
	{
		EmployedStudent empStud = new EmployedStudent("Sousuke Sagara", 7, new Employee(0.5f));
		
		System.out.println("Employed Student's university number: " + empStud.getUnNumber());
		System.out.println("Employed Student's salary: " + empStud.getSalary());
	}
}