package com.wtomaszewski.study.patterns.decorator;

public abstract class DeveloperDecorator implements Developer {

    protected Developer tempDeveloper;

    public DeveloperDecorator(final Developer developer) {
        this.tempDeveloper = developer;
    }

    public String getKnowledge() {
        return tempDeveloper.getKnowledge();
    }

    @Override
    public double getSalary() {
        return tempDeveloper.getSalary();
    }
}
