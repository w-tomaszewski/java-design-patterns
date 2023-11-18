package com.wtomaszewski.study.patterns.decorator;

public class JavascriptDeveloper extends DeveloperDecorator {

    private final int yearsOfKnowledge;

    public JavascriptDeveloper(final Developer developer, final int yearsOfKnowledge) {
        super(developer);
        this.yearsOfKnowledge = yearsOfKnowledge;

        if (!(DecoratorUtils.checkDeveloperInHierarchy(BasicDeveloper.class, developer))) {
            throw new IllegalArgumentException("JavascriptDeveloper can only be created with a BasicDeveloper in the chain.");
        }
    }

    @Override
    public String getKnowledge() {
        return tempDeveloper.getKnowledge() + " | I know Javascript language";
    }

    @Override
    public double getSalary() {
        return tempDeveloper.getSalary() + (yearsOfKnowledge * 100);
    }
}