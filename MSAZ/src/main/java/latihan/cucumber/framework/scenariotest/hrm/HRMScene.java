package latihan.cucumber.framework.scenariotest.hrm;

public enum HRMScene {
	
//	T1("User invalid login"),
	T1("User invalid login"),
	T2("User valid login");
//	T3("Dashboard user function");
	
	private String testName;
	
	private HRMScene(String values) {
		testName = values;
	}
	
	public String getTestName() {
		return testName;
	}	
}
