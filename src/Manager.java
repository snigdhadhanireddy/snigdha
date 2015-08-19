
public class Manager extends Employee
{
String type;
Manager(int empId,String empName,double empSalary,String type)
{
	super(empId,empName,empSalary);
	this.type=type;
}
public void setEmpSalary(double empSalary) {
	this.empSalary = empSalary;
}
public void displayDetails()
{
	super.displayDetails();
	System.out.println("The type of employee "+type);
}
}
