package SingletonPattern;

public class SimpleSingleton {
    int i = 1;
    private static SimpleSingleton singleton = new SimpleSingleton();

    private SimpleSingleton() {
        System.out.println("SimpleSingleton is created");
    }

    public static SimpleSingleton getInstance() {
        return singleton;
    }
}
