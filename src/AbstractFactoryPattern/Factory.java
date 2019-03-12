package AbstractFactoryPattern;

public interface Factory<T, U> {
    T make(U product);
}
