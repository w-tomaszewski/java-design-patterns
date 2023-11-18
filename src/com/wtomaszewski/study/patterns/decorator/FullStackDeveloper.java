package com.wtomaszewski.study.patterns.decorator;

public class FullStackDeveloper extends DeveloperDecorator {
    public FullStackDeveloper(Developer developer) {
        super(developer);

        if (!(DecoratorUtils.checkDeveloperInHierarchy(JavaDeveloper.class, developer) && DecoratorUtils.checkDeveloperInHierarchy(JavaDeveloper.class, developer))) {
            throw new IllegalArgumentException("FullStackDeveloper can only be created with a JavaDeveloper and Javascript developer in the chain.");
        }
    }

    @Override
    public String getKnowledge() {
        return tempDeveloper.getKnowledge() + " | I can work on frontend and backend";
    }

    @Override
    public double getSalary() {
        return tempDeveloper.getSalary() + 1000;
    }
}
