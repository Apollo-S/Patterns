package AdapterPattern;

public class Dodge implements Car {

    private boolean cleanStatus;

    public Dodge() {
        cleanStatus = false;
    }

    public Dodge(boolean status) {
        this.cleanStatus = status;
    }

    public boolean hasCleanStatus() {
        return cleanStatus;
    }

    public void setCleanStatus(boolean status) {
        cleanStatus = status;
    }

    @Override
    public void setWashed() {
        setCleanStatus(true);
        System.out.println("Dodge became clean");
    }

}
