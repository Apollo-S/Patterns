package SingletonPattern;

public class SingletonLazyInitialization {

    int i = 1;
    private static SingletonLazyInitialization instance;

    private SingletonLazyInitialization() {
        System.out.println("SimpleSingleton is created");
    }

    public static SingletonLazyInitialization getInstance() {
        if (instance == null) {
            return new SingletonLazyInitialization();
        }
        return instance;
    }

}
