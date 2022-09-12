package latihan.testng;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCalculator {
	
	Calculator c;
	
	@BeforeTest
	public void instance() {
		System.out.println("== SELAMAT WELCOME ==");
		c = new Calculator();
	}
	
	@Test
	public void testAddNilai() {
		Calculator c = new Calculator();
		int x = 5;
		int y = 10;
		assertEquals(c.addNilaiActual(x, y),c.addNilaiExpect(x, y));
//		5 + 10 -> kalau keluar lebih dari 15, bugs
	}
}
