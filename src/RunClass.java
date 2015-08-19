
public class RunClass 
{
public static void main(String args[])
{
	DayScholar dayStud=new DayScholar(12,"snigdha",2000,19000);
	
	dayStud.displayDetails();
	double balanceFee =dayStud.payFee(20000);
	System.out.println("The balance fee to be paid is "+balanceFee);
	Hosteller hostelStud=new Hosteller(31,"vidya",2000,35000);
	hostelStud.displayDetails();
	double balanceFee1 =hostelStud.payFee(21000);
	System.out.println("The balance fee to be paid is "+balanceFee1);
	
}
}
