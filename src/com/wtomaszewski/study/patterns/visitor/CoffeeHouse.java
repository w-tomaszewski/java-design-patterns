package com.wtomaszewski.study.patterns.visitor;

public class CoffeeHouse implements Building {

    private String address;

    public CoffeeHouse(final String address) {
        this.address = address;
    }

    @Override
    public void accept(InsurerVisitor visitor) {
        visitor.visitCoffeeHouse(this);
    }

    @Override
    public String getAddress() {
        return address;
    }
}
