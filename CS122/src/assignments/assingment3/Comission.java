package assignments.assingment3;

public class Comission extends Hourly{

	public double total_Sales;
	public double comission_Rate;
	
	public Comission(String eName, String eAddress, String ePhone, String socSecNumber, double rate, double comissionRate){
		super(eName, eAddress, ePhone, socSecNumber, rate);
		comission_Rate = comissionRate;
	}
	public void addSales(double totalSales) {
		total_Sales += totalSales;
	}
	public double pay()
	{
	double payment = super.pay() + (comission_Rate*total_Sales);
	return payment;
	}
	public String toString()
	{
	String result = super.toString();
	result += "\n Total Sales = $" + total_Sales;
	return result;
	}
	
}
