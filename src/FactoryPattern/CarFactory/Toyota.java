package FactoryPattern.CarFactory;

public class Toyota implements Car {
    @Override
    public void drive() {
        System.out.println("Driving Toyota");
    }
}
