package FactoryPattern.TankFactory;

public class T80 implements Tank {
    @Override
    public void shoot() {
        System.out.println("Shooting from T-80 tank");
    }
}
