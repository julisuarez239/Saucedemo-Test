package com.saucedemo.tasks;

import com.saucedemo.interactions.WaitMoment;
import com.saucedemo.userinterfaces.ShoppingUser;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

public class ShoppingTask implements Task {
    private String option;
    private String product;


    public ShoppingTask(String option) {
        this.option = option;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ShoppingUser.SEL_LIST.of(option)),
                Click.on(ShoppingUser.SEL_PURCHASE.of(product)),
                Click.on(ShoppingUser.BTN_ADD_CARD),
                Click.on(ShoppingUser.BTN_SHOPPING_CART),
                WaitMoment.pageInSeconds(30)
        );
    }

    public static ShoppingTask withInfo(String option) {

        return Tasks.instrumented(ShoppingTask.class, option);
    }

    public ShoppingTask withProduct(String product) {
        this.product = product;
        return this;
    }
}
