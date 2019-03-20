package AdapterPattern;

public class CarAdapter implements Car {

    Track track;

    public CarAdapter(Track track) {
        this.track = track;
    }

    @Override
    public void setWashed() {
        track.clean();
    }

}
