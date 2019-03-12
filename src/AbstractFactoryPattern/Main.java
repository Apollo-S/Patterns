package AbstractFactoryPattern;

import AbstractFactoryPattern.FurnitureFactory.Furniture;
import AbstractFactoryPattern.FurnitureFactory.FurnitureProduct;
import AbstractFactoryPattern.MilkFactory.Milk;
import AbstractFactoryPattern.MilkFactory.MilkProduct;

import static AbstractFactoryPattern.FactoryType.FURNITURE_FACTORY;
import static AbstractFactoryPattern.FactoryType.MILK_FACTORY;

public class Main {

    public static void main(String[] args) {
        AbstractFactory abstractFactory = new AbstractFactory();

        Factory milkFactory = abstractFactory.create(MILK_FACTORY);
        Milk yogurt = (Milk) milkFactory.make(MilkProduct.YOGURT);
        Milk sourCream = (Milk) milkFactory.make(MilkProduct.SOUR_CREAM);
        yogurt.eat();
        sourCream.eat();

        Factory furnitureFactory = abstractFactory.create(FURNITURE_FACTORY);
        Furniture nightstand = (Furniture) furnitureFactory.make(FurnitureProduct.NIGHTSTAND);
        Furniture wardrobe = (Furniture) furnitureFactory.make(FurnitureProduct.WARDROBE);
        nightstand.open();
        nightstand.close();
        wardrobe.open();
        wardrobe.close();
    }

}

