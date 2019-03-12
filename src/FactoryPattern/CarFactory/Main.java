package FactoryPattern.CarFactory;

public class Main {

    public static void main(String[] args) {
        CarFactory factory = new CarFactory();
        Car toyota = factory.create(CarType.TOYOTA);
        Car audi = factory.create(CarType.AUDI);
        Car bentley = factory.create(CarType.BENTLEY);

        toyota.drive();
        audi.drive();
        bentley.drive();
    }

}
