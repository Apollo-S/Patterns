package FactoryPattern;

public class CarFactory {
    public Car create(CarType carType) {
        switch (carType) {
            case TOYOTA:
                return new Toyota();
            case AUDI:
                return new Audi();
            case BENTLEY:
                return new Bentley();
            default:
                return null;
        }
    }
}
