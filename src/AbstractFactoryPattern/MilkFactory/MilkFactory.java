package AbstractFactoryPattern.MilkFactory;

import AbstractFactoryPattern.Factory;
import AbstractFactoryPattern.FurnitureFactory.Furniture;

public class MilkFactory implements Factory<Milk, MilkProduct> {
    @Override
    public Milk make(MilkProduct product) {
        switch (product) {
            case SOUR_CREAM:
                return new SourCream();
            case YOGURT:
                return new Yogurt();
            default:
                return null;
        }
    }
}
