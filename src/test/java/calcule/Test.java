package calcule;

import static org.junit.Assert.*;

import org.junit.Before;

public class Test {
private Calcul cacul;
	@Before
	public void setUp() throws Exception {
		cacul=new Calcul();
	}

	@org.junit.Test
	public void test() {
		assertEquals(10, cacul.addition(10, 0));
		
	}

}
