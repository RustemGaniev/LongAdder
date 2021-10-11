package com.company;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.LongAdder;
import java.util.stream.IntStream;

public class Main {


    public static void main(String[] args) throws InterruptedException {

        Shop shop = new Shop();

        ExecutorService poolProfit = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
        LongAdder totalProfit = new LongAdder();
        IntStream.range(0, 3)
                .forEach(i -> poolProfit.submit(() -> totalProfit.add(shop.call())));
        poolProfit.awaitTermination(3, TimeUnit.SECONDS);
        System.out.println("\n Сумма выручки составила: " + totalProfit.sum());
        poolProfit.shutdown();
    }


}

