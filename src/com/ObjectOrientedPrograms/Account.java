package com.ObjectOrientedPrograms;

import java.util.Scanner;

class AccountManagment{
	
	Scanner sc=new Scanner(System.in);
	
	int Addbalance;
	int totalbalance=5;
	// for add balance 
	public void addbalance() {
		System.out.println("Enter amount For Add balance: ");	
	  Addbalance=sc.nextInt(); 
	  totalbalance +=Addbalance;
	  System.out.println("Updated balance: "+ totalbalance);	
	}	
   // for withDrawn	
	public void debit(){
		System.out.println("Enter amount for withdraw");
		int withdraw=sc.nextInt();
		
		if (withdraw>totalbalance) {
			System.out.println("ohh your balance is lower than: "+withdraw);
		}else {
			totalbalance -=withdraw;
			System.out.println("your account withraw "+withdraw);
			System.out.println("your current balance"+ totalbalance);
		}
		
	}
	
}

public class Account {
	public static void main(String[] args) {
		AccountManagment obj=new AccountManagment();
		obj.addbalance();
		obj.debit();
		
		

	}

}
