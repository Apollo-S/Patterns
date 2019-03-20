package AdapterPattern;

public class Main {
    public static void main(String[] args) {
        Dodge dodge = new Dodge();
        System.out.println("Dodge is clean? - " + dodge.hasCleanStatus());

        CarWash carWash = new CarWash();

        carWash.washCar(dodge);
        System.out.println("Dodge is clean? - " + dodge.hasCleanStatus());

        Kenworth kenworth = new Kenworth();
        System.out.println("Kenworth track is clean? - " + kenworth.getCleanState());

        carWash.washCar(new CarAdapter(kenworth));
        System.out.println("Kenworth track is clean? - " + kenworth.getCleanState());

    }
}
