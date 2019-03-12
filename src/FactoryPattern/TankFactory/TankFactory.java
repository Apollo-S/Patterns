package FactoryPattern.TankFactory;

public class TankFactory {
    public Tank create(TankType tankType) {
        switch (tankType) {
            case T34:
                return new T34();
            case T56:
                return new T56();
            case T80:
                return new T80();
            default:
                return null;
        }
    }
}
