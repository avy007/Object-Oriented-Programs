package com.ObjectOrientedPrograms;

import java.util.Scanner;

class StockManagment{
	
	int Noofstock;
	int NoOfShare;
	double shareprice;
	double totalshareprice;
	double totalstockprice;
	String [] nameofshare;
	
	public void stockamount() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of stock");
		Noofstock=sc.nextInt();
		System.out.println("enter no of share");
		NoOfShare=sc.nextInt();
		System.out.println(" enter name of share by comma seprate");
		nameofshare=sc.next().split(",");
		System.out.println("enter share price ");
		shareprice=sc.nextDouble();
		totalshareprice=shareprice*NoOfShare;
		System.out.println("total value of each stock: "+totalshareprice);
		totalstockprice=Noofstock*totalshareprice;
		System.out.println("total stock price is: "+totalstockprice );
		
	}
}

public class Portfolio {

	public static void main(String[] args) {
		StockManagment obj=new StockManagment();
		obj.stockamount();
		
	

	}

}
