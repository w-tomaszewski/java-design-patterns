package com.wtomaszewski.study.patterns;

import com.wtomaszewski.study.patterns.decorator.*;
import com.wtomaszewski.study.patterns.visitor.*;

import java.util.Arrays;
import java.util.List;

public class DecoratorPatternExample implements IPatternExample{

    // new decorators can be easily added, some of them could be related to other and then there will be a need
    // to throw exception in decorator constructor
    // other real world example is the Pizza where ingredients can be added as a decorator
    @Override
    public void implementPatternExample() {

        int javaKnowledge = 3;
        int javascriptKnowledge = 2;

        final Developer trueFullStackDeveloper = new FullStackDeveloper(new JavascriptDeveloper(new JavaDeveloper(new BasicDeveloper(), javaKnowledge), javascriptKnowledge));
        System.out.printf("Developer Knowledge: %s | Developer salary: %s\n", trueFullStackDeveloper.getKnowledge(), trueFullStackDeveloper.getSalary());

        try {
            // fake fullStackDeveloper - missing JavaDeveloper decorator
            new FullStackDeveloper(new JavascriptDeveloper(new BasicDeveloper(), javascriptKnowledge));
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            // fake fakeJavaDeveloper - missing BasicDeveloper decorator
            new JavaDeveloper(null, javaKnowledge);
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            // fake fakeJavascriptDeveloper - missing BasicDeveloper decorator
            new JavascriptDeveloper(null, javascriptKnowledge);
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
