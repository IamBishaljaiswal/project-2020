package javaassessment1;

public  class masterCardPayment extends paymentcardstype
{
  public masterCardPayment(double amount) {
		super(amount);
		// TODO Auto-generated constructor stub
	}

public final double surChargesc = 0.015;
  public static double salesAmount;
  public static double surCharge;
  
  
 {
  double surChargesc;
  double salesAmount; 
  double surCharge;
 }
 
 public double masterCardPayment(double salesAmt)
 {
   salesAmt = salesAmt + (salesAmt * surChargesc);
   return salesAmt; 
 }
 
 public double surChargeValue(double salesAmt)
 {
   surCharge = salesAmt * surChargesc;
   return surCharge;
 }

@Override
public double calculatesurcharge() {
	// TODO Auto-generated method stub
	return 0;
}

@Override
public double CalculateSurCharge() {
	// TODO Auto-generated method stub
	return 0;
}
}