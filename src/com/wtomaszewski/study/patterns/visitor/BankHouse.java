package com.wtomaszewski.study.patterns.visitor;

public class BankHouse implements Building {

    private String address;

    public BankHouse(final String address) {
        this.address = address;
    }

    @Override
    public void accept(InsurerVisitor visitor) {
        visitor.visitBankHouse(this);
    }

    @Override
    public String getAddress() {
        return address;
    }
}
