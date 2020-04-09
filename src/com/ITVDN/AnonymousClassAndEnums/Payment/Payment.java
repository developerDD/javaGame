package com.ITVDN.AnonymousClassAndEnums.Payment;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class Payment {
    private ArrayList<Product> basket;
    private double totalGoods;
    private Market market;

    private class Market {
        private ArrayList<Product> goods;

        public Market() {
            goods = new ArrayList<>();
            goods.add(new Product("Rise", 10));
            goods.add(new Product("Bread", 5.3));
            goods.add(new Product("Banana", 15.8));
            goods.add(new Product("Orange", 12.4));
            goods.add(new Product("Eag", 18.6));
        }

        public void addProductToMarket(Product product) {
            if (goods != null) {
                goods.add(product);
            }
        }

        public void dellProductFromMarket(Product product) {
            if (goods != null) {
                for (Product good : goods) {
                    if (good.getNameProduct().equals(product.getNameProduct())) {
                        goods.remove(good);
                        System.out.println("Dell -> " + good);
                        break;
                    }
                }
            }
        }

        public Product findProductByName(String nameFindProd) {
            for (Product good : goods) {
                if (good.getNameProduct().equals(nameFindProd)) {
                    return good;
                }
            }
            return null;
        }

        public void showAllProduct() {
            for (Product good : goods) {
                System.out.println(good);
            }
        }
    }

    public Payment() {
        basket = new ArrayList<>();
        market = new Market();
    }

    public double getTotalGoods() {
        return totalGoods;
    }

    public void toMarket(@NotNull String... name) {
        Product toBasket = null;
        for (String s : name) {
            toBasket = market.findProductByName(s);
            if (toBasket != null) {
                basket.add(toBasket);
            } else {
                System.out.println("There is " + s + " no such product!");
            }

        }
    }

    public void showBasket() {
        for (Product product : basket) {
            System.out.println(product);
            totalGoods += product.getPrice();
        }
        System.out.println("Total by basket - " + totalGoods);
    }
}
