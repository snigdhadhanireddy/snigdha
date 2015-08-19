
public class Hosteller extends Student
{
double hostelFee;
Hosteller(int studId,String studName,double examFee,double hostelFee)
{
	super(studId,studName,examFee);
	this.hostelFee=hostelFee;
}
double payFee(double amount)
{
	totalAmount=examFee+hostelFee-amount;
	System.out.println("The amount paid is "+amount);
	return totalAmount;
}
}
