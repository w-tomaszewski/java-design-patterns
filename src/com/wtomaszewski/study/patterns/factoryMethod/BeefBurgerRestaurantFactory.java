package com.wtomaszewski.study.patterns.factoryMethod;

public class BeefBurgerRestaurantFactory extends BurgerRestaurantFactory {

    @Override
    public Burger makeBurger() {
        return new BeefBurger();
    }
}
