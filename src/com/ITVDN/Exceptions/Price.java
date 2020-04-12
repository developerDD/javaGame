package com.ITVDN.Exceptions;

import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class Price implements Comparable<Price> {
    private String nameGoods;
    private String nameShop;
    private double price;
    private static Price[] arr;
    private static int count;

    static {
        arr = new Price[2];
    }

    private Price(String nameGoods, String nameShop, double price) {
        this.nameGoods = nameGoods;
        this.nameShop = nameShop;
        this.price = price;
    }

    public static void addArr(Price price) {
        arr[count] = price;
        count++;
    }

    public static Price inputPrice() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name goods: ");
        String name = sc.next();
        System.out.print("Enter name shop: ");
        String shop = sc.next();
        try {
            System.out.print("Enter price this goods: ");
            double pr = sc.nextDouble();
            return new Price(name, shop, pr);
        } catch (Exception e) {
            try {
                throw new Exception("Entered data price wrong!");
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        }
        return null;
    }

    protected static void searchShop(String shop) throws Exception {
        if (shop == null || shop.length() == 0) throw new Exception("No entered name shop!");
        boolean found = false;
        for (Price price : arr) {
            if (price.getNameShop().equals(shop)) {
                found = true;
                System.out.println(price);
            }
        }
        if (!found) {
            throw new Exception("No found shop!");
        }
    }

    public String getNameShop() {
        return nameShop;
    }

    @Override
    public String toString() {
        return "Goods: " + nameGoods + " price: " + price + " $";
    }

    @Override
    public int compareTo(@NotNull Price price) {
        return this.nameShop.compareTo(price.nameShop);
    }

    public static void main(String[] args) throws Exception {
        Price.addArr(Price.inputPrice());
        Price.addArr(Price.inputPrice());

        Scanner sc = new Scanner(System.in);
        String name = sc.next();

        Price.searchShop(name);
    }
}
