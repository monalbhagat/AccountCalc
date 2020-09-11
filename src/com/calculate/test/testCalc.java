package com.calculate.test;

import com.calculate.app.Calculator;

public class testCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c = new Calculator();
		String[] inputs = {
				"﻿25-01-2020,-4000,SBI MF",
				"28-01-2020,-1740.6,Stationary",
				"25-02-2020,-2800.3,Grocery",
				"28-02-2020,-3200.5,Swiggy",
				"20-02-2020,1200.8,Royalty",
				"17-03-2020,-200,Stationary",
				"15-03-2020,-2600.60,Grocery",
				"10-03-2020,-1500.99,Grocery",
				"05-03-2020,20000.6,Salary"};
		System.out.println(c.generateReceipt(inputs));
		
	}

}
/*
 ﻿25-01-2020,-4000,SBI MF
28-01-2020,-1740.6,Stationary
25-02-2020,-2800.3,Grocery
28-02-2020,-3200.5,Swiggy
20-02-2020,1200.8,Royalty
17-03-2020,-200,Stationary
15-03-2020,-2600.60,Grocery
10-03-2020,-1500.99,Grocery
05-03-2020,20000.6,Salary



﻿Total Income: 21201.4
Total Expense: 16042.99
Total Saving: 5158.41
Top Expense Month: 6000.8 @Feb
 */