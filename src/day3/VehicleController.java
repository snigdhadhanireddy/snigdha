package day3;

public class VehicleController 
{
	public static void main(String ar[])
	{
Vehicle ref=new Audi();
Driver dref=new Audi();
ref.engine();
ref.milege();
ref.brakes();
dref.driverName();
ref=new Mercedes();
ref.engine();
ref.milege();
ref.brakes();

}
}
