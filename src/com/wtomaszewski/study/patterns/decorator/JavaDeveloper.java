package com.wtomaszewski.study.patterns.decorator;

public class JavaDeveloper extends DeveloperDecorator {

    private final int yearsOfKnowledge;

    public JavaDeveloper(final Developer developer, final int yearsOfKnowledge) {
        super(developer);
        this.yearsOfKnowledge = yearsOfKnowledge;

        if (!(DecoratorUtils.checkDeveloperInHierarchy(BasicDeveloper.class, developer))) {
            throw new IllegalArgumentException("JavaDeveloper can only be created with a BasicDeveloper in the chain.");
        }
    }

    @Override
    public String getKnowledge() {
        return tempDeveloper.getKnowledge() + " | I know Java language";
    }

    @Override
    public double getSalary() {
        return tempDeveloper.getSalary() + (yearsOfKnowledge * 200);
    }
}
