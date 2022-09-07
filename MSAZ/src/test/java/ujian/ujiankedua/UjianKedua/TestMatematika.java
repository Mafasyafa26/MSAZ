package ujian.ujiankedua.UjianKedua;

import java.util.Random;

import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import ujian.ujiankedua.Matematika;
import ujian.ujiankedua.DataGenerate.DataGenerate;

public class TestMatematika {
	
	Matematika mt = new Matematika();
	Random rdm = new Random();
	DataGenerate dg = new DataGenerate(); 
	
//	@BeforeTest
//	   public void beforeTest() {
//	      System.out.println("== BEFORE TEST DIMULAI ==");
//	   }
	
	@BeforeClass
	   public void beforeClass() {
		  System.out.println("=============================");
	      System.out.println("== BEFORE CLASS MATEMATIKA ==");
		  System.out.println("=============================");

	   }
	
//	@BeforeMethod
//	public void beforeMethod() {
//		System.out.println("== BEFORE METHOD ==");
//	}
	
	@Test (priority = 0)
	public void testTambahNilai() {
		int x = 1;
		int y = 500;
		int m = dg.intRdm(x, y);
		int n = dg.intRdm(x, y);
		AssertJUnit.assertEquals(mt.tambahNilaiActual(m, n),mt.tambahNilaiExpect(m,n));
		System.out.println("===================================");
	}
	
	@Test (priority = 1)
	public void testKurangNilai() {
		int x = 1;
		int y = 100;
		int m = dg.intRdm(x, y);
		int n = dg.intRdm(x, y);
		AssertJUnit.assertEquals(mt.kurangNilaiActual(m, n),mt.kurangNilaiExpect(m,n));
		System.out.println("===================================");
	}
	
	@Test (priority = 2)
	public void testBagiNilai() {
		int x = 1;
		int y = 500;
		int m = dg.intRdm(x, y);
		int n = dg.intRdm(x, y);
		AssertJUnit.assertEquals(mt.bagiNilaiActual(m, n),mt.bagiNilaiExpect(m,n));
		System.out.println("===================================");
	}
	
	@Test (priority = 3)
	public void testModulusNilai() {
		int x = 1;
		int y = 1000;
		int m = dg.intRdm(x, y);
		int n = dg.intRdm(x, y);
		AssertJUnit.assertEquals(mt.modulusNilaiActual(m, n),mt.modulusNilaiExpect(m,n));
	}
	
//	@AfterMethod
//	   public void afterMethod() {
//	      System.out.println("== AFTER METHOD ==");
//	   }
	
	@AfterClass
	   public void afterClass() {
		  System.out.println("============================");
	      System.out.println("== AFTER CLASS MATEMATIKA ==");
		  System.out.println("============================");
	   }
	
//	@AfterTest
//	   public void afterTest() {
//	      System.out.println("== AFTER TEST ==");
//	   }
}
