package javaassessment1;



public abstract  class  paymentcardstype extends paymenttype implements surcharge {

	public paymentcardstype(double amount) {
		super(amount);
		// TODO Auto-generated constructor stub 
	}
	
	public abstract double CalculateSurCharge();

	
	}

