
public class DayScholar extends Student
{
double transportFee;

DayScholar(int studId,String studName,double examFee,double transportFee)
{
	super(studId,studName,examFee);
	this.transportFee=transportFee;
}
double payFee(double amount)
{
	totalAmount=examFee+transportFee-amount;
	System.out.println("The amount paid is "+amount);
	return totalAmount;
}

}
