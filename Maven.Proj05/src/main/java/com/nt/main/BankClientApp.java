package com.nt.main;
import com.nt.service.*;

public class BankClientApp {

	public static void main(String[] args)
	{
		System.out.println("BankClientApp.main() (from maven proj05)");
		// create obj of bank service and use the method 
		BankService service=new BankService();
		System.out.println("Interest Amount :: "+service.calcSimpleInterest(100000.0, 2.0, 12.0));

	}

}
