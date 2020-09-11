package com.calculate.app;

import com.calculate.core.entity.Item;
import com.calculate.core.factory.ItemFactory;
import com.calculate.receipt.Receipt;

import java.util.List;

public class Calculator {

    public Receipt generateReceipt(String[] inputs) {
        List<Item> items = ItemFactory.from(inputs);
        return new Receipt(items);
    }
}
