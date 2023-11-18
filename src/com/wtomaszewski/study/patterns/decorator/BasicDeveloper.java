package com.wtomaszewski.study.patterns.decorator;

public class BasicDeveloper implements Developer {

    @Override
    public String getKnowledge() {
        return "I have a basic programming knowledge";
    }

    @Override
    public double getSalary() {
        return 500;
    }
}
