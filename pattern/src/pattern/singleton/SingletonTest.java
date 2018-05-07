package pattern.singleton;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SingletonTest {

	@Test
    public void testGetInstanceWithHungerMode() {
		HungerModeSingleton o1 = HungerModeSingleton.getInstance();
		HungerModeSingleton o2 = HungerModeSingleton.getInstance();

        assertEquals(o1, o2);
	}

    @Test
    public void testGetInstanceWithLazyMode() {
        LazyModeSingleton o1 = LazyModeSingleton.getInstance();
        LazyModeSingleton o2 = LazyModeSingleton.getInstance();

        assertEquals(o1, o2);
    }

    @Test
    public void testGetStaticInnerClassModeSingleton() {
        StaticInnerClassModeSingleton o1 = StaticInnerClassModeSingleton.getInstance();
        StaticInnerClassModeSingleton o2 = StaticInnerClassModeSingleton.getInstance();

        assertEquals(o1, o2);
    }
}
