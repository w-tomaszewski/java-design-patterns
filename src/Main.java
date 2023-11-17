import com.wtomaszewski.study.patterns.IPatternExample;
import com.wtomaszewski.study.patterns.VisitorPatternExample;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<IPatternExample> implementedDesignPatterns = Arrays.asList(
             new VisitorPatternExample()
        );

        implementedDesignPatterns.stream().forEach(IPatternExample::implementPatternExample);
    }
}