
public class Employee 
{
int empId;
String empName;
double empSalary;
public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public double getEmpSalary() {
	return empSalary;
}
public void setEmpSalary(double empSalary) {
	this.empSalary = empSalary;
}

Employee(int empId,String empName,double empSalary)
{
	this.empId=empId;
	this.empName=empName;
	this.empSalary=empSalary;
	
}
public void displayDetails()
{
	System.out.println("The id is"+empId);
	System.out.println("The name is"+empName);
	System.out.println("The salary is"+empSalary);
}


}
