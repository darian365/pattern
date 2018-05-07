package pattern.singleton;

/**
 * 双重检测
 * 
 * @author Fei.Li
 *
 */
public class DoubleCheckModeSingleton {
    private static DoubleCheckModeSingleton instance;

    private DoubleCheckModeSingleton() {
    }

    public DoubleCheckModeSingleton getInstance() {
        if (instance == null) {
            DoubleCheckModeSingleton object;
            synchronized (DoubleCheckModeSingleton.class) {
                object = instance;
                if (object == null) {
                    synchronized (DoubleCheckModeSingleton.class) {
                        if (object == null) {
                            object = new DoubleCheckModeSingleton();
                        }
                    }
                }
                instance = object;
            }
        }
        return instance;
    }
}
