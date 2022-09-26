package ujian.ujiankelima.cucumber;

public enum DemoQAShop {
	T1("Login user"),
	T2("Registrasi user");
	
	private String testName;
	
	private DemoQAShop(String value) {
		testName = value;
	}
	
	public String getTestName() {
		return testName;
	}
}
