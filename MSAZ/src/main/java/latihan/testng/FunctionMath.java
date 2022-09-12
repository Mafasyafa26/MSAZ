package latihan.testng;

public class FunctionMath {

	public String testMathPowActual(String x) {
		// TODO Auto-generated method stub
		String strOutput = "";
		try {
			strOutput = String.valueOf(Math.pow(Double.parseDouble(x), Double.parseDouble(x)));
		} catch(Exception e) {
			strOutput = ""+e;
		}
		System.out.println("TEST MATH POW ACTUAL ==> " +strOutput);
		return strOutput;
	}
	
	public String testMathPowExpect(String x) {
		// TODO Auto-generated method stub
		String strOutput = "";
		try {
			strOutput = String.valueOf(Math.pow(Double.parseDouble(x), Double.parseDouble(x)));
		} catch(Exception e) {
			strOutput = ""+e;
		}
		System.out.println("TEST MATH POW EXPECT ==> " +strOutput);
		return strOutput;
	}
	
}
