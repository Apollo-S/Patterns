package FactoryPattern.CarFactory;

public class Audi implements Car {
    @Override
    public void drive() {
        System.out.println("Driving Audi");
    }
}