package Singleton;

public class EagerSingleton {
    private static final EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {
        // Private constructor to prevent external instantiation
    }

    public static EagerSingleton getInstance() {
        return instance;
    }
}
