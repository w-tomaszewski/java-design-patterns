package com.wtomaszewski.study.patterns.factoryMethod;

public class VegeBurger implements Burger {
    @Override
    public void prepare() {
        System.out.println("Preparing Vege Burger");
    }

}
