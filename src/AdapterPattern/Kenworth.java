package AdapterPattern;

public class Kenworth implements Track {

    private boolean isClean;

    public boolean getCleanState() {
        return isClean;
    }

    @Override
    public void clean() {
        isClean = true;
        System.out.println("Kenworth track became clean");
    }

}
