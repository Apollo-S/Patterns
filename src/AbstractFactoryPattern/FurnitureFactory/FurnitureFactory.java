package AbstractFactoryPattern.FurnitureFactory;

import AbstractFactoryPattern.Factory;

public class FurnitureFactory implements Factory<Furniture, FurnitureProduct> {
    @Override
    public Furniture make(FurnitureProduct product) {
        switch (product) {
            case WARDROBE: return new Wardrobe();
            case NIGHTSTAND: return new Nightstand();
            default: return null;
        }
    }
}
