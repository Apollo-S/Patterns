package SingletonPattern;

public class Main {
    public static void main(String[] args) {
        SimpleSingleton simpleSingleton1;
        simpleSingleton1 = SimpleSingleton.getInstance();
        System.out.println(simpleSingleton1.i++);
        SimpleSingleton simpleSingleton2 = SimpleSingleton.getInstance();
        System.out.println(simpleSingleton2.i);

        SingletonLazyInitialization singletonLazyInitialization1 = SingletonLazyInitialization.getInstance();
        System.out.println(singletonLazyInitialization1.i++);
        SingletonLazyInitialization singletonLazyInitialization2 = SingletonLazyInitialization.getInstance();
    }
}
