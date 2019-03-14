package BuilderPattern;

public interface HouseBuilder {

    HouseBuilder buildFloor(String material);
    HouseBuilder buildWall(String material);
    HouseBuilder buildRoof(String material);
    House build();

}
