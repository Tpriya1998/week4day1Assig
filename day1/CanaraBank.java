package week4.day1;

import classwork.Demonstrate;

public class CanaraBank implements Demonstrate {
	
	@Override
	public void cashOnDelivery() {
		System.out.println("cash delivery is 5000");
		
	}

	@Override
	public void upiPayments() {
		System.out.println("upi payment is 20000");
		
	}

	@Override
	public void cardPayments() {
		System.out.println("cardPayments limit is 200");
		
	}

	@Override
	public void internetBanking() {
		System.out.println("internetBanking is limit 1lakh");		
	}
	public static void main(String[] args) {
		CanaraBank bankOptions = new CanaraBank();
		bankOptions.cashOnDelivery();
		bankOptions.upiPayments();
		bankOptions.cardPayments();
		bankOptions.internetBanking();
		
		
		
		

	}


}
