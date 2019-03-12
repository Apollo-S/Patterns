package FactoryPattern;

import static FactoryPattern.CarType.*;

public class Main {

    public static void main(String[] args) {
        CarFactory factory = new CarFactory();
        Car toyota = factory.create(TOYOTA);
        Car audi = factory.create(AUDI);
        Car bentley = factory.create(BENTLEY);

        toyota.drive();
        audi.drive();
        bentley.drive();
    }

}
