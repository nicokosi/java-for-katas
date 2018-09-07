package org.nicokosi.foo;

public class DrinkMaker {

    public static final String SEPARATOR = ":";
    private int cents = 0;

    public String prepareOrder(Order drink, Extras extras) {
        if (cents < 60) {
            return "M:Missing " + (60 - cents)  + " cents";
        }
        if (drink == Order.MESSAGE) {
            return "M:message-content";
        }
        return drink.translate() + SEPARATOR + prepareSugars(extras);
    }

    private String prepareSugars(Extras extras) {
        return hasSugar(extras) ? "" + extras.sugars() + SEPARATOR + "0" : ":";
    }

    private boolean hasSugar(Extras extras) {
        return extras.sugars() >= 1;
    }

    public void insertMoney(int cents) {
        this.cents += cents;
    }
}
