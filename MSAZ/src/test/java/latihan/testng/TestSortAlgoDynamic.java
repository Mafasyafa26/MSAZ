package latihan.testng;

import static org.testng.Assert.assertEquals;

import java.util.Random;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestSortAlgoDynamic {
	
//	tanpa input
	
	SortAlgorithm sA;
	int loopRandom = 0;
	int [] intNext;
	Random rand;
	int indexAwal;
	int indexAkhir;
	int jumlahData;
	int loopAfter = 1;
	int loopBefore = 1;
	
	@BeforeClass
	   public void befClass() {
	      System.out.println("INITIATE - BEFORE CLASS");
	   }
	
	@BeforeTest
	public void befTest() {
		sA = new SortAlgorithm();
		rand = new Random();
		System.out.println("INITIATE - BEFORE TEST");
	}
	
	@BeforeMethod
	public void befMethod() 
	{
		System.out.println("INITIATE - BEFORE Method " +loopBefore);
		jumlahData = rand.nextInt(5, 20);
//		jumlah data : banyaknya data array yang akan diinput
		intNext = new int[jumlahData];
		loopBefore++;
		
	}
	
	

	@Test
	public void testPertama() 
	{
		System.out.println("INITIATE - TEST CASE KE - 1");
		indexAwal = 0;
		indexAkhir = 100;
		
		for(int i = 0; i < jumlahData; i++) 
		{
			intNext[i] = rand.nextInt(0,100);
		} assertEquals(sA.selectionSortASCInt(intNext), sA.bubbleSortASCInt(intNext),"Kedua data tidak cocok");
//		kedua data tidak cocok akan muncul, ketika line ke 77 di sA < jadi failures 
	}
	
	@Test
	public void testKedua() 
	{
		System.out.println("INITIATE - TEST CASE KE - 2");

		indexAwal = 1000;
		indexAkhir = 10000;
		
		for(int i = 0; i < jumlahData; i++) 
		{
			intNext[i] = rand.nextInt(indexAwal, indexAkhir);
		} assertEquals(sA.selectionSortASCInt(intNext), sA.bubbleSortASCInt(intNext),"Kedua data tidak cocok");
	}
	
	@AfterMethod
	public void aftMethod() {
		System.out.println("INITIATE - After method " +loopAfter);
		loopAfter++;
	}
	
	@AfterTest
	public void aftTest() 
	{
		System.out.println("INITIATE - After test ");
		
	}
	
	@AfterClass
	   public void aftClass() {
	      System.out.println("INITIATE - AFTER CLASS");
	   }
	
}
