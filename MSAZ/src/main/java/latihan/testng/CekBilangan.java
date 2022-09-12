package latihan.testng;

public class CekBilangan {
	
	public String cbGenap(int a) {
		String cb = "";
		if(a%2==0) {
			System.out.println("Bilangan Genap");
		} 
		return cb;
	}
	
	public String cbGanjil(int a) {
		String cb = "";
		if(a%2!=0) {
			System.out.println("Bilangan Ganjil");
		} 
		return cb;
	}

}
