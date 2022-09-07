package ujian.ujiankedua.UjianKedua;

import java.util.Random;

import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import ujian.ujiankedua.Geometri;
import ujian.ujiankedua.DataGenerate.DataGenerate;

public class TestGeometri {

	Geometri g = new Geometri();
	Random rdm = new Random();
	DataGenerate dg = new DataGenerate();
	
//	@BeforeTest
//	   public void beforeTest() {
//	      System.out.println("== BEFORE TEST GEOMETRI DIMULAI ==");
//	   }
	
	@BeforeClass
	   public void beforeClass() {
		  System.out.println("==========================");
	      System.out.println("== BEFORE CLASS GEOMETRI ==");
		  System.out.println("==========================");
	   }
	
//	@BeforeMethod
//	public void beforeMethod() {
//		System.out.println("== BEFORE METHOD ==");
//	}
	
	@Test (priority = 0)
	public void testLuasPersegi() {
		int x = 1;
		int y = 50;
		int m = dg.intRdm(x, y);
		int n = dg.intRdm(x, y);
		AssertJUnit.assertEquals(g.luasPersegiActual(m),g.luasPersegiExpect(m));
		System.out.println("===================================");

	}
	
	@Test (priority = 1)
	public void testLuasSegitiga() {
		Geometri g = new Geometri();
		int x = 5;
		int y = 100;
		int m = dg.intRdm(x, y);
		int n = dg.intRdm(x, y);
		AssertJUnit.assertEquals(g.luasSegitigaActual(m,n),g.luasSegitigaExpect(m, n));
		System.out.println("===================================");
	}
	
	@Test (priority = 2)
	public void testLuasTrapesium() {
		Geometri g = new Geometri();
		double a = dg.intRdm(1, 20);
		double b = dg.intRdm(1, 25);
		double t = dg.intRdm(1, 30);
		AssertJUnit.assertEquals(g.luasTrapesiumActual(a, b, t),g.luasTrapesiumExpect(a, b, t));
	}
	
//	@AfterMethod
//	   public void afterMethod() {
//	      System.out.println("== AFTER METHOD ==");
//	   }
	
	@AfterClass
	   public void afterClass() {
		  System.out.println("==========================");
	      System.out.println("== AFTER CLASS GEOMETRI ==");
		  System.out.println("==========================");
	   }
	
//	@AfterTest
//	   public void afterTest() {
//	      System.out.println("== AFTER TEST GEOMETRI SELESAI ==");
//	   }
	
	
}
