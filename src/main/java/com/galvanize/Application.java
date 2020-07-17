package com.galvanize;

import com.galvanize.fundamentals.innerclasses.Product;

public class Application {
    public static void main(String[] args) {
        //System.out.println("hello world");
        Product product = new Product("aaloo", 534);
        System.out.println(product.getCurrency().getUSD(534));
    }
}
