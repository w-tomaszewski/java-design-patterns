import com.wtomaszewski.study.patterns.DecoratorPatternExample;
import com.wtomaszewski.study.patterns.FactoryMethodPatternExample;
import com.wtomaszewski.study.patterns.IPatternExample;
import com.wtomaszewski.study.patterns.VisitorPatternExample;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<IPatternExample> implementedDesignPatterns = Arrays.asList(
             new VisitorPatternExample(),
             new FactoryMethodPatternExample(),
             new DecoratorPatternExample()
        );

        implementedDesignPatterns.forEach(designPattern -> {
            System.out.printf("Pattern %s example start\n", designPattern.getClass().getSimpleName());
            System.out.println("----------------------------------");
            designPattern.implementPatternExample();
            System.out.println("----------------------------------");
            System.out.printf("Pattern %s example end\n", designPattern.getClass().getSimpleName());
        });
    }
}