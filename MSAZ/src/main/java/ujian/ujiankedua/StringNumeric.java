package ujian.ujiankedua;

public class StringNumeric {

	public boolean testParseToIntExpect(String x) {
		boolean isExcept = true;
		try {
			int a = Integer.parseInt(x);
		} catch (Exception e) {
			isExcept = false;
		}
		System.out.println("PARSE TO INT EXPECT = " +isExcept);
		return isExcept;
	}
	
	public boolean testParseToIntActual(String x) {
		boolean isExcept = true;
		try {
			int a = Integer.parseInt(x);
		} catch (Exception e) {
			isExcept = false;
		}
		System.out.println("PARSE TO INT ACTUAL = " +isExcept);
		return isExcept;
	}
}
