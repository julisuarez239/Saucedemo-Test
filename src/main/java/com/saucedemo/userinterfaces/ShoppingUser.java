package com.saucedemo.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ShoppingUser {
    public static final Target SEL_LIST = Target.the("seleccionar de lista").locatedBy("//option[contains(.,'{0}')]");
    public static final Target SEL_PURCHASE = Target.the("seleccionar compra").locatedBy("//div[@class='inventory_item_name ' and contains(.,'{0}')]");
    public static final Target BTN_ADD_CARD = Target.the("boton agregar tarjeta").locatedBy("//button[@id='add-to-cart-sauce-labs-fleece-jacket']");
    public static final Target BTN_SHOPPING_CART = Target.the("boton shopping_cart").locatedBy("//div[@id='shopping_cart_container']");

}
