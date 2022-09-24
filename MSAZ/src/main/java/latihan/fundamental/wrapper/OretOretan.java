package latihan.fundamental.wrapper;

import java.util.Vector;

import latihan.fundamental.method.StaticCounter;
import latihan.fundamental.oop.Bulean;
import latihan.fundamental.oop.ModelEncaps;

public class OretOretan {
	public double phi = 3.14;
	
	public static void main(String[] args) {		
//		System.gc();
		//SHIFT + ALT + D,
		ModelEncaps me = new ModelEncaps("Adith","manda","Perempuan");
//		ModelEncaps me ;
		me = new ModelEncaps("Adith","manda","Perempuan");
		System.out.println("USERNAME : "+me.getUserN());
		System.out.println("PASSWORD : "+me.getPassword());
		System.out.println("PASSWORD : "+me.getJenisKelamin());
		System.out.println("============================");
		me.setUserN("BAGAS");
		me.setPassword("BAGASKARA");
		me.setJenisKelamin("LAKI-LAKI");
		System.out.println("USERNAME : "+me.getUserN());
		System.out.println("PASSWORD : "+me.getPassword());
		System.out.println("PASSWORD : "+me.getJenisKelamin());
//		System.out.println(StaticCounter.count);
//		double f = 0.7 * StaticCounter.count;		
//		String a = me.userN;
		xMethod(0);
	}
	public static String xMethod (String b, int x)
	{
		System.out.println("MEMPROSES INFORMASI");
		System.out.println("TAMBAHAN INFORMASI");
		
		return "";
	}
	public static String xMethod(int a)
	{
		System.out.println("MEMPROSES INFORMASI");
		return "";
	}
}