package org.nicokosi.foo;

public enum Order {
    TEA("T"), CHOCOLATE("H"), COFFEE("C"), MESSAGE("M");

    private String drinkCode;

    Order(String drinkCode) {
        this.drinkCode = drinkCode;
    }

    String translate() {
        return drinkCode;
    }
}
