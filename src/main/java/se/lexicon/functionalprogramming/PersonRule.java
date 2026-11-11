package se.lexicon.functionalprogramming;

@FunctionalInterface
public interface PersonRule {
    boolean test(Person person);
}