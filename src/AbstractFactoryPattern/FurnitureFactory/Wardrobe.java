package AbstractFactoryPattern.FurnitureFactory;

public class Wardrobe implements Furniture {
    @Override
    public void open() {
        System.out.println("Wardrobe is opened");
    }

    @Override
    public void close() {
        System.out.println("Wardrobe is closed");
    }
}
