package com.saucedemo.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src\\test\\resources\\com.saucedemo\\shopping.feature",
        glue = "com.saucedemo.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE)
public class ShoppingRunner {
}
