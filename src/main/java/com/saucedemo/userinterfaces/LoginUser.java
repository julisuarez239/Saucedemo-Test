package com.saucedemo.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class LoginUser {

    public static final Target TXT_USER = Target.the("texto usuario").locatedBy("//input[@id='user-name']");

    public static final Target TXT_PASSWORD = Target.the("texto contraseña").locatedBy("//input[@id='password']");

    public static final Target BTN_LOGIN = Target.the("boton login").locatedBy("//input[@id='login-button']");

}
