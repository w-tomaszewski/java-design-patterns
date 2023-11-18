package com.wtomaszewski.study.patterns.factoryMethod;

public class VegeBurgerRestaurantFactory extends BurgerRestaurantFactory {
    @Override
    public Burger makeBurger() {
        return new VegeBurger();
    }
}
