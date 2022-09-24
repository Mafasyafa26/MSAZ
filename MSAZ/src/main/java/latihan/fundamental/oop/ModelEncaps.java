package latihan.fundamental.oop;

public class ModelEncaps {

	private String userN;
	private String password;
	private String jenisKelamin;
//	String[] xStr = {"B","doIt","INI PESAN ERROR NYA","WAKTU","",""};
//	private String clName;
//	private String funcName;
//	private String errMessage;
//	private String createdBy;
//	private String createdDate;
//	AUDIT RAIL
	
	public ModelEncaps(String userName, String pwd, String jKel) {
		this.userN = userName;
		this.password = pwd;
		this.jenisKelamin = jKel;
	}
	
	public ModelEncaps() {
		
	}
	
	public ModelEncaps(String userName) {
		this.userN = userName;
	}	
	
	public String getUserN() {
		return userN;
	}
	public void setUserN(String userN) {
		this.userN = userN;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getJenisKelamin() {
		return jenisKelamin;
	}
	public void setJenisKelamin(String jenisKelamin) {
		this.jenisKelamin = jenisKelamin;
	}
	
}