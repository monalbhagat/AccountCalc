package com.calculate.receipt;

import java.util.List;

import com.calculate.core.entity.Item;

public class Receipt {
    private double totalIncome = 0.0;
    private double totalExpense = 0.0;

    public Receipt(List<Item> items) {


        for (Item item : items) {
            totalIncome += ((item.getAmount()>0)?item.getAmount():0);
            totalExpense += ((item.getAmount()<0)?item.getAmount():0)*-1;
        }

    }

    public double getTotalIncome() {
        return totalIncome;
    }

    public double getTotalExpense() {
        return totalExpense;
    }

    @Override
    public String toString() {
        return "Total Income : " + getTotalIncome() + "\n"
                + "Total Expense: " + getTotalExpense()+"\n";
    }
}
