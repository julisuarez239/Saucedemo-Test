package com.saucedemo.stepdefinitions;

import com.saucedemo.questions.YourCartQuestion;
import com.saucedemo.tasks.ShoppingTask;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.questions.TheValue;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

public class ShoppingStepDefinition {

    @When("purchasing process")
    public void purchasingProcess(DataTable dataTable) {
        List<String> info = dataTable.values();
        OnStage.theActorInTheSpotlight().attemptsTo(ShoppingTask.withInfo(info.get(0))
                        .withProduct(info.get(1))
                );
    }

    @Then("validates that the text is reflected {string}")
    public void validatesThatTheTextIsReflected(String result) {
        Boolean resultTest = OnStage.theActorInTheSpotlight()
                .asksFor(YourCartQuestion.withResult(result));

        OnStage.theActorInTheSpotlight().should(seeThat("validación resultado esperado",
                TheValue.of(resultTest).asBoolean(), equalTo(true)));

    }

}
