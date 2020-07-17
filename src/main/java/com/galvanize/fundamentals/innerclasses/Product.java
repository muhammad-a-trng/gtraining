package com.galvanize.fundamentals.innerclasses;

public class Product {
    public Product(String name, int valueInCents) {
        this.name = name;
        this.valueInCents = valueInCents;
        this.currency = new Currency();
    }

    private String name;
    private int valueInCents;
    private Currency currency;

    public String getName() {
        return name;
    }

    public int getValueInCents() {
        return valueInCents;
    }

    public Currency getCurrency() {
        return currency;
    }

    //declare your class here
    public static class Currency {

      public String getUSD(int currencyInCents) {
            return new StringBuilder("$")
                    .append(String.valueOf(currencyInCents / 100))
                    .append(".")
                    .append(String.valueOf(currencyInCents % 100))
                    .toString();
        }
    }
}
