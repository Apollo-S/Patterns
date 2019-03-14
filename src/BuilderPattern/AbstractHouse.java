package BuilderPattern;

import java.util.Objects;

public abstract class AbstractHouse {

    private String floorType;
    private String roofType;
    private String wallType;

    public String getFloorType() {
        return floorType;
    }

    public void setFloorType(String floorType) {
        this.floorType = floorType;
    }

    public String getRoofType() {
        return roofType;
    }

    public void setRoofType(String roofType) {
        this.roofType = roofType;
    }

    public String getWallType() {
        return wallType;
    }

    public void setWallType(String wallType) {
        this.wallType = wallType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractHouse that = (AbstractHouse) o;
        return Objects.equals(getFloorType(), that.getFloorType()) &&
                Objects.equals(getRoofType(), that.getRoofType()) &&
                Objects.equals(getWallType(), that.getWallType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFloorType(), getRoofType(), getWallType());
    }

    @Override
    public String toString() {
        return  "floorType='" + floorType + '\'' +
                ", roofType='" + roofType + '\'' +
                ", wallType='" + wallType + '\'';
    }
}
