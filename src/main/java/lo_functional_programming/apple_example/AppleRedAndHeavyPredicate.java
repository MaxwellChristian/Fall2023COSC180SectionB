package lo_functional_programming.apple_example;

public class AppleRedAndHeavyPredicate implements ApplePredicate {
    public boolean test(Apple apple){
        return "red".equals(apple.getColor())
                && apple.getWeight() > 150;
    }
}
