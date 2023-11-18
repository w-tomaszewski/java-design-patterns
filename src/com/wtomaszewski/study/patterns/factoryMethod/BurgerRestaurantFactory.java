package com.wtomaszewski.study.patterns.factoryMethod;

public abstract class BurgerRestaurantFactory {
    public Burger orderBurger() {
        final Burger burger = makeBurger();
        burger.prepare();
        return burger;
    }

    protected abstract Burger makeBurger();
}