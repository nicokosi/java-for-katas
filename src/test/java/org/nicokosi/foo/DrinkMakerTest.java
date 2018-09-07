package org.nicokosi.foo;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.useDefaultRepresentation;

public class DrinkMakerTest {

    @Test
    public void should_prepare_a_tea() {
        DrinkMaker drinkMaker = new DrinkMaker();
        drinkMaker.insertMoney(100);

        String order = drinkMaker.prepareOrder(Order.TEA, new Extras(0));

        assertThat(order).isEqualTo("T::");
    }

    @Test
    public void should_prepare_a_coffee() {
        DrinkMaker drinkMaker = new DrinkMaker();
        drinkMaker.insertMoney(100);

        String order = drinkMaker.prepareOrder(Order.COFFEE, new Extras(0));

        assertThat(order).isEqualTo("C::");
    }

    @Test
    public void should_prepare_a_hot_chocolate() {
        DrinkMaker drinkMaker = new DrinkMaker();
        drinkMaker.insertMoney(100);

        String order = drinkMaker.prepareOrder(Order.CHOCOLATE, new Extras(0));

        assertThat(order).isEqualTo("H::");
    }

    @Test
    public void should_prepare_a_coffee_with_one_sugar() {
        DrinkMaker drinkMaker = new DrinkMaker();
        drinkMaker.insertMoney(100);

        String order = drinkMaker.prepareOrder(Order.COFFEE, new Extras(1));

        assertThat(order).isEqualTo("C:1:0");
    }

    @Test
    public void should_prepare_a_coffee_with_two_sugars() {
        DrinkMaker drinkMaker = new DrinkMaker();
        drinkMaker.insertMoney(100);

        String order = drinkMaker.prepareOrder(Order.COFFEE, new Extras(2));

        assertThat(order).isEqualTo("C:2:0");
    }

    @Test
    public void should_prepare_a_tea_with_one_sugar() {
        DrinkMaker drinkMaker = new DrinkMaker();
        drinkMaker.insertMoney(100);

        String order = drinkMaker.prepareOrder(Order.TEA, new Extras(1));

        assertThat(order).isEqualTo("T:1:0");
    }

    @Test
    public void should_return_a_message_for_the_customer() {
        DrinkMaker drinkMaker = new DrinkMaker();
        drinkMaker.insertMoney(100);

        String order = drinkMaker.prepareOrder(Order.MESSAGE, new Extras(0));

        assertThat(order).isEqualTo("M:message-content");
    }

    @Test
    public void should_send_message_when_no_money_is_inserted() {
        DrinkMaker drinkMaker = new DrinkMaker();

        drinkMaker.insertMoney(0);
        String order = drinkMaker.prepareOrder(Order.COFFEE, new Extras(0));

        assertThat(order).isEqualTo("M:Missing 60 cents");
    }

    @Test
    public void should_send_a_message_when_not_enough_money_is_inserted_for_a_coffee() {
        DrinkMaker drinkMaker = new DrinkMaker();

        drinkMaker.insertMoney(20);
        String order = drinkMaker.prepareOrder(Order.COFFEE, new Extras(0));

        assertThat(order).isEqualTo("M:Missing 40 cents");
    }
}