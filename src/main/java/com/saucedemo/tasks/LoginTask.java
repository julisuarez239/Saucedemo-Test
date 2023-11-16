package com.saucedemo.tasks;

import com.saucedemo.userinterfaces.LoginUser;
import com.saucedemo.utils.Constants;
import io.netty.util.Constant;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


public class LoginTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(Constants.USER).into(LoginUser.TXT_USER),
                Enter.theValue(Constants.PASSWORD).into(LoginUser.TXT_PASSWORD),
                Click.on(LoginUser.BTN_LOGIN)
        );
    }

    public static LoginTask with() {
        return Tasks.instrumented(LoginTask.class);
    }
}
