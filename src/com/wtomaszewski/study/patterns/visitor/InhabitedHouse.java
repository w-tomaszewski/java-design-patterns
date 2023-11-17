package com.wtomaszewski.study.patterns.visitor;

public class InhabitedHouse implements Building {

    private String address;

    public InhabitedHouse(final String address) {
        this.address = address;
    }

    @Override
    public void accept(InsurerVisitor visitor) {
        visitor.visitInhabitedHouse(this);
    }

    @Override
    public String getAddress() {
        return address;
    }
}
