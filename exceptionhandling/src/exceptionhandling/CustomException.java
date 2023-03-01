package exceptionhandling;

import java.util.Scanner;
 class Insufficientbalance extends Exception {

	

	public Insufficientbalance(String string) {
		// TODO Auto-generated constructor stub
		System.out.println(string);
	}

}
public  class CustomException {
		 public static void main(String[] args) {
	int bal=1000;
	
	int withdrawAmount;
	Scanner sc =new  Scanner(System.in);
	System.out.println("Enter amount to withdraw");
	withdrawAmount=sc.nextInt();
	try {
		if(withdrawAmount>bal) {
			throw new Insufficientbalance("enter valid ammount");
			
		}else
			System.out.println("withdrawAmount is" + withdrawAmount);
	}catch (Exception e) {
		
		
	}
	
			 
}
}
	