package se.lexicon.functionalprogramming;

@FunctionalInterface
public interface PersonAction {
    void execute(Person person);
}