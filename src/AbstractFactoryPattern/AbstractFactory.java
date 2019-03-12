package AbstractFactoryPattern;

import AbstractFactoryPattern.FurnitureFactory.FurnitureFactory;
import AbstractFactoryPattern.MilkFactory.MilkFactory;

public class AbstractFactory {
    public Factory create(FactoryType factoryType) {
        switch (factoryType) {
            case MILK_FACTORY: return new MilkFactory();
            case FURNITURE_FACTORY: return new FurnitureFactory();
            default: return null;
        }
    }
}
