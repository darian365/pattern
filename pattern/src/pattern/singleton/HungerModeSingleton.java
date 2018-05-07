package pattern.singleton;

/**
 * Hunger mode : 1. good performance with no sychronization but will waste some
 * resource because loading resource is happening but using may not happen. 2.
 * loading static resources is controlled by JVM which will not suffer
 * concurrent issues.
 * 
 * @author Fei.Li
 *
 */
public class HungerModeSingleton {

	private static HungerModeSingleton instance = new HungerModeSingleton();
	
	private HungerModeSingleton() {
	}
	
	public static HungerModeSingleton getInstance() {
		return instance;
	}
}
