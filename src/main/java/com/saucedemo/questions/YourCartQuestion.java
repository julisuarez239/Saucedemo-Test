package com.saucedemo.questions;

import com.saucedemo.userinterfaces.YourCartUser;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.questions.TheValue;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.containsString;

public class YourCartQuestion implements Question<Boolean> {
    private final String result;

    public YourCartQuestion(String result) {
        this.result = result;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        actor.should(seeThat("Validate result",
                TheValue.of(Text.of(YourCartUser.SEL_PRODUCT)
                        .answeredBy(actor)).asString(), containsString(result)));
        return true;
    }

    public static YourCartQuestion withResult(String result) {
        return new YourCartQuestion(result);
    }
}

