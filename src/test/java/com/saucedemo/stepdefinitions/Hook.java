package com.saucedemo.stepdefinitions;

import com.saucedemo.tasks.LoginTask;
import com.saucedemo.utils.Constants;
import com.saucedemo.utils.Driver;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class Hook {
    @Before
    public void inicializeActor() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActor("user");
    }
    @Given("user open application")
    public void userOpenApplication() {
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(Driver.chrome().onUrl(Constants.URL_APP)));
    }
    @Given("login in aplication")
    public void loginInAplication() {
        OnStage.theActorInTheSpotlight().attemptsTo(LoginTask.with());
    }
}
