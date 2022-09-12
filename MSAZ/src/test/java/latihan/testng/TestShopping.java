package latihan.testng;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class TestShopping {
	
	ShoppingActivity sA = new ShoppingActivity();

	@Test
	public void addProdSatu() {
		assertEquals(sA.addProdSatu(), 10000);
	}
	
	@Test
	public void hitungBelanja() {
		assertEquals(sA.hitungTotalBelanja(), 9500);
//		diskon 500
	}
}
