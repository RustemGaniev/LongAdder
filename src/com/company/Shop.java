package com.company;

import java.util.Random;
import java.util.concurrent.Callable;

public class Shop implements Callable {

    @Override
    public Long call() {

        int minProfit = 99;
        int maxProfit = 1200;
        int profitSize = 50;
        long shopProfit = 0;
        int[] profit = new int[profitSize];

        for (int i = 0; i < profitSize; i++) {
            profit[i] = new Random().nextInt((maxProfit - minProfit) + 1) + minProfit;
            shopProfit += profit[i];
        }
        return shopProfit;
    }
}

