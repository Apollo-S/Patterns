package AbstractFactoryPattern.FurnitureFactory;

public class Nightstand implements Furniture {
    @Override
    public void open() {
        System.out.println("Nightstand is opened");
    }

    @Override
    public void close() {
        System.out.println("Nightstand is closed");
    }
}
