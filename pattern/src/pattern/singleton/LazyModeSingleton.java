package pattern.singleton;

public class LazyModeSingleton {
    private static LazyModeSingleton instance;

    private LazyModeSingleton() {
    }

    public synchronized static LazyModeSingleton getInstance() {
        if(instance == null) {
            instance = new LazyModeSingleton();
        }
        return instance;
    }
}
