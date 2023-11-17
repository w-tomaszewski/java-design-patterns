package com.wtomaszewski.study.patterns.visitor;

public class CompanyAInsurerVisitor implements InsurerVisitor {

    private final String WELCOME_WORD = "Hello, I'm from company A";

    @Override
    public void visitInhabitedHouse(InhabitedHouse building) {
        System.out.printf("%s. Do you want to buy health insurance for address %s\n", WELCOME_WORD, building.getAddress());
    }

    @Override
    public void visitBankHouse(BankHouse bankHouse) {
        System.out.printf("%s. Do you want to buy steal insurance for address %s\n", WELCOME_WORD, bankHouse.getAddress());
    }

    @Override
    public void visitCoffeeHouse(CoffeeHouse coffeeHouse) {
        System.out.printf("%s. Do you want to buy fire and water insurance for address %s\n", WELCOME_WORD, coffeeHouse.getAddress());
    }
}
