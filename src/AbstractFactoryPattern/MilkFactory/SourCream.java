package AbstractFactoryPattern.MilkFactory;

public class SourCream implements Milk {
    @Override
    public void eat() {
        System.out.println("Sour Cream was eaten");
    }
}
