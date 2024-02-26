package com.wtomaszewski.study.patterns.decorator;
public class DecoratorUtils {

    public static <T extends Developer> boolean checkDeveloperInHierarchy(Class<T> developerClass, Developer developer) {
        if (developerClass.isInstance(developer)) {
            return true;
        } else if (developer instanceof DeveloperDecorator) {
            return checkDeveloperInHierarchy(developerClass, ((DeveloperDecorator) developer).tempDeveloper);
        } else {
            return false;
        }
    }
}
