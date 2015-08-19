
public class Student 
{
int studId;
String studName;
double examFee;
double amount;
double totalAmount;
Student(int studId,String studName,double examFee)
{
	this.studId=studId;
	this.studName=studName;
	this.examFee=examFee;
}
void displayDetails()
{
	System.out.println("The Id is "+studId);
	System.out.println("The Name is "+studName);
	System.out.println("The ExamFee is "+examFee);
}
double payFee(double amount)
{
	amount=examFee-amount;
	return amount;
}

}
