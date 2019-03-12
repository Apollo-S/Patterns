package FactoryPattern.TankFactory;

public class T34 implements Tank {
    @Override
    public void shoot() {
        System.out.println("Shooting from T-34 tank");
    }
}
