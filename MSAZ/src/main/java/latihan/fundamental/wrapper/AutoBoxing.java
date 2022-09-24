package latihan.fundamental.wrapper;

import java.util.ArrayList;

public class AutoBoxing {

	//AUTOBOXING
	
	public static void main(String[] args) {
		
		
		
		Boolean abs = new Boolean("true");
		
		Boolean isBooleans = new Boolean(false);
		Double.parseDouble("4.0012");
		
		boolean isBo = true;
		String strBo = "true";
		
		String strTest = "a";
		System.out.println(strTest.concat("ku"));//"a"+"ku"
		String strBool = "true";
		
		boolean isBooleanVar = false;
		boolean isBooleanParam = true;
		boolean isStrToBool = Boolean.parseBoolean(strBool);
		System.out.println("Parsing dari str ke boolean : "+isStrToBool);//hanya true jika string diisi true saja
		Boolean isBooleanObject = isBooleanVar;
		System.out.println(isBooleanObject.compareTo((5>3)));
		System.out.println(isBooleanObject);
		System.out.println("Parsing dari str ke boolean : "+isStrToBool);//hanya true jika string diisi true saja
		
		//special case
		byte byteVar = '2';
		byte byteParam = 2;
		Byte byteObject = byteVar;
		System.out.println(byteVar);
		System.out.println(byteParam);
		System.out.println(byteObject);
		System.out.println(byteObject.compareTo(byteVar));
				
		char chVar = 'a';
		Character chObject = chVar;
		System.out.println(chObject.compareTo('n'));
		System.out.println(chObject);

		int intVar = 2;
		Integer intObject = intVar;
		int intTest = intObject;
		System.out.println(intObject.compareTo(8));
		System.out.println(intObject);

		//CTRL + /
		float floatVar = 3;
		float floatParam = 5;
		Float floatObject = floatVar;
		System.out.println(floatObject);
		System.out.println(floatObject.compareTo(floatParam));
		
		double doubleVar = 2.0;
		double doubleParam = 3.0;
		Double doubleObject = 2.0;
		System.out.println(doubleObject);
		System.out.println(doubleObject.compareTo(4.0));
//		
//		/*
//		 * Akhiran L memberi tahu kompiler bahwa kita memiliki literal angka yang panjang. 
//		 * Java byte , short , int dan long tipe yang digunakan mewakili angka presisi tetap.
//		 * Ini berarti bahwa mereka dapat mewakili bilangan bulat dalam jumlah terbatas.
//		 */
		long longVar = 1L;
		long longParam = 2L;
		Long longObject = longVar;
		System.out.println(longObject);
		System.out.println(longObject.compareTo(3L));
		
		
		short shortVar = 2;
		short shortParam = 3;
		Short shortObject = shortVar;
		System.out.println(shortObject);
		System.out.println(shortObject.compareTo(shortParam));
	}
}