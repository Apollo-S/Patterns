package FactoryMethod;

public class Person {

    private Person() {
    }

    public static Person create() {
        return new Person();
    }

    public void shout() {
        System.out.println("Aaaaaaaaa... (Person shouts loudly)");
    }

}
