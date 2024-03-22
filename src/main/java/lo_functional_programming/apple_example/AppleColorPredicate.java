package lo_functional_programming.apple_example;

public class AppleColorPredicate implements ApplePredicate {
    public boolean test(Apple apple) {
        return "green".equals(apple.getColor());
    }
}
