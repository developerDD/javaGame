package com.ITVDN.AnonymousClassAndEnums.Payment;

public class Product {
        private String nameProduct;
        private double price;
        public   Product(String name,double price){
            this.nameProduct =name;
            this.price=price;
        }

        public String getNameProduct() {
            return nameProduct;
        }

        public double getPrice() {
            return price;
        }

    @Override
    public String toString() {
        return nameProduct+", price -> "+price;
    }
}
