package com.company;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.LongAdder;

public class Shop {

    LongAdder total = new LongAdder();

    public void shopProfit() {

        int minProfit = 99;
        int maxProfit = 1200;
        int profitSize = 50;
        int[] profit = new int[profitSize];

        for (int i = 0; i < profitSize; i++) {
            profit[i] = new Random().nextInt((maxProfit - minProfit) + 1) + minProfit;
            total.add(profit[i]);
        }
    }

    public long getTotal(){
        return total.sum();
    }
}

