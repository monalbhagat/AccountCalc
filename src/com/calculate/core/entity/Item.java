package com.calculate.core.entity;


public class Item {

    private double amount;
    private String date;
    private String category;

    public Item(String date, String amount, String category) {
        
    	this.amount = Double.valueOf(amount);
        this.date = date;
        this.category = category;
    }

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
}
