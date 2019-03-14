package BuilderPattern;

public class CustomHouseBuilder implements HouseBuilder {

    private House house;

    public CustomHouseBuilder() {
        house = new House();
    }

    @Override
    public HouseBuilder buildFloor(String material) {
        house.setFloorType(material);
        return this;
    }

    @Override
    public HouseBuilder buildWall(String material) {
        house.setWallType(material);
        return this;
    }

    @Override
    public HouseBuilder buildRoof(String material) {
        house.setRoofType(material);
        return this;
    }

    @Override
    public House build() {
        return house;
    }

}
