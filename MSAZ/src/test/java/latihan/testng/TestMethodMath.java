package latihan.testng;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class TestMethodMath {
	FunctionMath fM = new FunctionMath();
	
	@Test
	public void testMathPow() {
		String strPow = "2.0";
		
		assertEquals(fM.testMathPowActual(strPow), fM.testMathPowExpect(strPow));
	}
}
