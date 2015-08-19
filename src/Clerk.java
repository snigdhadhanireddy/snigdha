
public class Clerk extends Employee
{
	int speed;
	int accuracy;
	Clerk(int empId,String empName,double empSalary,int speed,int accuracy)
	{
		super(empId,empName,empSalary);
		this.speed=speed;
		this.accuracy=accuracy;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	public void displayDetails()
	{
		super.displayDetails();
		System.out.println("The speed of clerk "+speed);
		System.out.println("The accuracy of clerk "+accuracy);
	}


}
