package Task2;
public class Student
{
	private String _name;
	private int _unNumber;
	
	public Student(String name, int unNumber)
	{
		_name = name;
		_unNumber = unNumber;
	}
	
	public String getName() {
		return _name;
	}
	public void setName(String name) {
		_name = name;
	}
	public int getUnNumber() {
		return _unNumber;
	}
	public void setUnNumber(int unNumber) {
		_unNumber = unNumber;
	}
}
