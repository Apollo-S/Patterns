package FactoryMethodPattern;

public class Main {
    public static void main(String[] args) {
        Person person = Person.create();
        person.shout();
    }
}
