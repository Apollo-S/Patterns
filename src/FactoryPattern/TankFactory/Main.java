package FactoryPattern.TankFactory;

import static FactoryPattern.TankFactory.TankType.*;

public class Main {
    public static void main(String[] args) {
        TankFactory tankFactory = new TankFactory();

        Tank tankT34 = tankFactory.create(T34);
        Tank tankT56 = tankFactory.create(T56);
        Tank tankT80 = tankFactory.create(T80);

        tankT34.shoot();
        tankT56.shoot();
        tankT80.shoot();
    }
}
