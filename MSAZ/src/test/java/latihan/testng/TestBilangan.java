package latihan.testng;

import org.testng.annotations.Test;

public class TestBilangan {
	
	CekBilangan cb = new CekBilangan();
	int bil = 200;
	
	@Test
	public void testGen() {
		CekBilangan cb = new CekBilangan();
		equals(cb.cbGenap(bil));
	}
	
	@Test
	public void testGan() {
		CekBilangan cb = new CekBilangan();
		equals(cb.cbGanjil(bil));
	}
}
