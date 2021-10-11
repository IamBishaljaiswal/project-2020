package javaassessment1;
import java.util.Scanner;
public class Main {

 public Main(double amount) {
		// TODO Auto-generated constructor stub
	}

public static void main(String[] args) {
  // TODO Auto-generated method stub
  cashpay cp;
  masterCardPayment mcp;
  amexvisacardpay avcp;
    
  double amount=0.0;
  int choice;
  char a='\0';
  
  System.out.println("*** WELCOME TO PAYMENT SECTION ***");
       do{
         System.out.println("Please Enter the sales amount:");
         Scanner reader = new Scanner(System.in);
        
         // get user input for a
         amount = reader.nextInt();
         System.out.println("Now please Select the Payment options first:");
         Scanner reader1 = new Scanner(System.in);
         
         System.out.println("option-1. <Cash> "
         		+ " option-2. <MasterCard> "
         		+ " option-3. <Amex visa Card>"); 
         choice = reader1.nextInt();
         
         switch (choice) {
         case 1:
          cp=new cashpay(amount);
          System.out.println("Total cash payments is $"+ cp.cashpay(amount));
          System.out.println("Total cash collection is $"+ cp.cashpay(amount));
          break;
          
         case 2:
          mcp= new masterCardPayment(amount);
         System.out.println("Total Master card payments is $"+ mcp.masterCardPayment(amount));
         System.out.println("Total surplus is $"+ mcp.surChargeValue(amount));
          break;
          
         case 3:
          avcp= new amexvisacardpay(amount);
          System.out.println("Total Amex visa card payment is $"+avcp.amexvisacardpay(amount));
          System.out.println("Total surplus is $"+ avcp.calculatesurcharge(amount));
          break;
      }
         System.out.println("Wish to Continue(Yes or No) ?");
         a=reader.next().charAt(0);
         
    }while((a!='n')&&(a!='N'));
  }
 }