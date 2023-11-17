package com.wtomaszewski.study.patterns.visitor;

public interface InsurerVisitor {
    public void visitInhabitedHouse(InhabitedHouse building);
    public void visitBankHouse(BankHouse builiding);
    public void visitCoffeeHouse(CoffeeHouse building);
}
