package com.ITVDN.AnonymousClassAndEnums.Payment;

import java.util.ArrayList;

public class Payment {
    private ArrayList<Product> basket;


    private class Product {
        private String nameProduct;
        private double price;
        Product(String name,double price){
            this.nameProduct =name;
            this.price=price;
        }

        public String getNameProduct() {
            return nameProduct;
        }

        public double getPrice() {
            return price;
        }
    }
}
