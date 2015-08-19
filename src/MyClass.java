
public class MyClass 
{
public static void main(String ar[])
{
	Employee empRef=new Employee(123,"snigdha",35000);
	System.out.println(empRef.getEmpId());
	System.out.println(empRef.getEmpName());
	System.out.println(empRef.getEmpSalary());
	empRef.setEmpId(345);
	empRef.setEmpName("vidya");
	empRef.setEmpSalary(40000);
	System.out.println(empRef.getEmpId());
	System.out.println(empRef.getEmpName());
	System.out.println(empRef.getEmpSalary());
	Manager mgRef=new Manager(654,"asha",54757,"HR");
	mgRef.displayDetails();
	mgRef.setEmpSalary(78578);
	mgRef.displayDetails();
	Clerk cRef=new Clerk(87,"ram",5895,54,86);
	cRef.displayDetails();
	cRef.setEmpSalary(7890);
	cRef.displayDetails();
	
			
}
}
