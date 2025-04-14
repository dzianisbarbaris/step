package by.savik.L14_04_2025.impl;

import by.savik.L14_04_2025.Apple;
import by.savik.L14_04_2025.Color;
import by.savik.L14_04_2025.predicate.ApplePredicate;

public class AppleGreenColourPredicate implements ApplePredicate<Apple> {
    @Override
    public boolean test(Apple apple) {
        return Color.GREEN.equals(apple.getColour());
    }
}
