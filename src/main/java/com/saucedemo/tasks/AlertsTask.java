package com.saucedemo.tasks;

import com.saucedemo.interactions.WaitMoment;
import com.saucedemo.userinterfaces.AlertsUser;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

public class AlertsTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(AlertsUser.BTN_SEE_ALERT),
                Click.on(AlertsUser.BTN_ALERT_5_S),
                WaitMoment.pageInSeconds(5),
                Scroll.to(AlertsUser.BTN_ALERT_5_S),
                Click.on(AlertsUser.BTN_ALERT_CONFIRM),
                Click.on(AlertsUser.BTN_ALERT_PROMPT)
        );

        //getDriver().switchTo().alert().accept();
        //getDriver().switchTo().alert().dismiss();
        //getDriver().switchTo().alert().sendKeys("prueba");
    }
    public static AlertsTask with (){
        return Tasks.instrumented(AlertsTask.class);
    }
}
