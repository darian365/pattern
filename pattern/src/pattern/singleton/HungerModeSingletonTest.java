package pattern.singleton;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HungerModeSingletonTest {

	@Test
	public void testGetInstance() {
		HungerModeSingleton o1 = HungerModeSingleton.getInstance();
		HungerModeSingleton o2 = HungerModeSingleton.getInstance();
		
        if (o1 == o2) {
            System.out.println("o1 == o2");
        }
        assertEquals(o1, o2);
	}

}
