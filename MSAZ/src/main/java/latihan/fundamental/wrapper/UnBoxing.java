package latihan.fundamental.wrapper;

public class UnBoxing {

	//UNBOXING
	public static void main(String[] args) {
		
		String strBool = "true";
		
		Boolean isBooleanObject = true;//dibalik dari autoboxing
		boolean isBooleanVar = isBooleanObject;
		boolean isBooleanParam = true;
		boolean isStrToBool = Boolean.parseBoolean(strBool);				
		System.out.println(isBooleanObject);
		
		//special case
		Byte byteObject = '2';//dibalik dari autoboxing
		byte byteVar = byteObject;
		byte byteParam = 2;
		System.out.println(byteVar);
		System.out.println(byteParam);
		System.out.println(byteObject);		
		System.out.println(byteObject.compareTo(byteParam));
		
		Character chObject = 'a';//dibalik dari autoboxing
		char chVar = chObject;		
		System.out.println(chObject.compareTo('n'));
		System.out.println(chObject);
		
		Integer intObject = 2;
		int intVar = intObject;	
		System.out.println(intObject.compareTo(8));
		System.out.println(intObject);
		
		Float floatObject = 3f;
		float floatVar = floatObject;
		float floatParam = 5;		
		System.out.println(floatObject);
		System.out.println(floatObject.compareTo(floatParam));
		
		double doubleVar = 2.0;
		double doubleParam = 3.0;
		Double doubleObject = doubleVar;
		System.out.println(doubleObject);
		System.out.println(doubleObject.compareTo(4.0));
		
		Long longObject = 1L;
		long longVar = longObject;
		long longParam = 2L;		
		System.out.println(longObject);
		System.out.println(longObject.compareTo(3L));
		
		
		Short shortObject = 2;
		short shortVar = shortObject;
		short shortParam = 3;		
		System.out.println(shortObject);
		System.out.println(shortObject.compareTo(shortParam));
	}
}
