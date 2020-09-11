package com.calculate.core;

import com.calculate.core.entity.Item;

public class ItemAdapter {

    public static Item createItemFromString(String input) {
    	String date = input.split(",")[0];
    	String amount = input.split(",")[1];
    	String category = input.split(",")[2];
    	
        return new Item(date,amount, category);
    }
}
