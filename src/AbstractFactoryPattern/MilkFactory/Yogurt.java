package AbstractFactoryPattern.MilkFactory;

public class Yogurt implements Milk {
    @Override
    public void eat() {
        System.out.println("Yogurt was eaten");
    }
}
