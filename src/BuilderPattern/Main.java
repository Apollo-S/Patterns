package BuilderPattern;

import static BuilderPattern.BuildingMaterial.*;

public class Main {
    public static void main(String[] args) {

        HouseBuilder strawHouseBuilder = new CustomHouseBuilder();
        strawHouseBuilder.buildWall(STRAW.toString().toLowerCase());
        strawHouseBuilder.buildFloor(STRAW.toString().toLowerCase());
        strawHouseBuilder.buildRoof(STRAW.toString().toLowerCase());
        House houseNifNif = strawHouseBuilder.build();
        System.out.println("Nif-Nif's " + houseNifNif);

        HouseBuilder woodenHouseBuilder = new CustomHouseBuilder();
        woodenHouseBuilder.buildWall(WOOD.toString().toLowerCase());
        woodenHouseBuilder.buildFloor(WOOD.toString().toLowerCase());
        woodenHouseBuilder.buildRoof(WOOD.toString().toLowerCase());
        House houseNufNuf = woodenHouseBuilder.build();
        System.out.println("Nuf-Nuf's " + houseNufNuf);

        HouseBuilder concreteHouseBuilder = new CustomHouseBuilder();
        concreteHouseBuilder.buildWall(CONCRETE.toString().toLowerCase());
        concreteHouseBuilder.buildFloor(CONCRETE.toString().toLowerCase());
        concreteHouseBuilder.buildRoof(CONCRETE.toString().toLowerCase());
        House houseNafNaf = concreteHouseBuilder.build();
        System.out.println("Naf-Naf's " + houseNafNaf);

    }
}
