package com.company;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Shop shop = new Shop();
        Thread shop1 = new Thread(null,() -> shop.shopProfit(),"Первый магазин");
        Thread shop2 = new Thread(null,() -> shop.shopProfit(),"Второй магазин");
        Thread shop3 = new Thread(null,() -> shop.shopProfit(),"Третийй магазин");

        shop1.start();
        shop2.start();
        shop3.start();

        shop1.join();
        shop2.join();
        shop3.join();

        System.out.printf("\n Сумма выручки со всех магазинов сотавила %d рублей \n", shop.getTotal());
    }
}

