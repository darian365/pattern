package pattern.singleton;

/**
 * 静态内部类单例模式 好处： 1. 外部类没有static属性，资源利用率高，非立即加载 2. 真正调用getInstance()时才会加载静态内部类 3.
 * 内部类加载是线程安全的，并且instance是static final类型，内存中只有这样一个实例存在，只能被赋值一次，所以是线程安全的 4.
 * 保证了高效调用和延迟加载的优势
 * 
 * @author Fei.Li
 *
 */
public class StaticInnerClassModeSingleton {

    private static class StaticInnerClassSingleton {
        private final static StaticInnerClassModeSingleton instance = new StaticInnerClassModeSingleton();
    }

    private StaticInnerClassModeSingleton() {
    }

    public static StaticInnerClassModeSingleton getInstance() {
        return StaticInnerClassSingleton.instance;
    }
}
