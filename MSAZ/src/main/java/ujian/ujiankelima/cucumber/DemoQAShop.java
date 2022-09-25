package ujian.ujiankelima.cucumber;

public enum DemoQAShop {
	T1("Login invalid"),
	T2("Register invalid");
	
	private String testName;
	
	private DemoQAShop(String value) {
		testName = value;
	}
	
	public String getTestName() {
		return testName;
	}
}
