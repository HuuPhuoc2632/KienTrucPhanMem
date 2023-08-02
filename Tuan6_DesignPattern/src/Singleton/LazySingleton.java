package Singleton;

public class LazySingleton {
    private static class LazyHolder {
        private static final LazySingleton instance = new LazySingleton();
    }

    private LazySingleton() {
        // Private constructor to prevent external instantiation
    }

    public static LazySingleton getInstance() {
        return LazyHolder.instance;
    }
}
