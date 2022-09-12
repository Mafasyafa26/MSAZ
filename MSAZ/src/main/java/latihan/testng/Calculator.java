package latihan.testng;

public class Calculator {

	public int addNilaiExpect(int a, int b) {
		int hasil = a+b;
		System.out.println("INI HASIL addNilaiExpect DARI " +a+ " + " +b+ " = " +hasil);
		return hasil;
	}
	
	public int addNilaiActual(int a, int b) {
		int hasil = (((a+b)*(a/a))*b)/b;
		System.out.println("INI HASIL addNilaiActual DARI " +a+ " + " +b+ " = " +hasil);
		return hasil;
	}
	
	public int subtractNilaiExpect(int a, int b) {
		int hasil = a-b;
		System.out.println("INI HASIL subtractNilaiExpect DARI " +a+ " - " +b+ " = " +hasil);
		return hasil;
	}
	
	public int subtractNilaiActual(int a, int b) {
		int hasil = (((a+b)/(a+b))*(a-b));
		System.out.println("INI HASIL subtractNilaiActual DARI " +a+ " - " +b+ " = " +hasil);
		return hasil;
	}
	
	public double devideNilaiExpect(int a, int b) {
		int hasil = a/b;
		System.out.println("INI HASIL devideNilaiExpect DARI " +a+ " : " +b+ " = " +hasil);
		return hasil;
	}
	
	public double devideNilaiActual(int a, int b) {
		int hasil = a;
		System.out.println("INI HASIL devideNilaiActual DARI " +a+ " : " +b+ " = " +hasil);
		return hasil;
	}
	
}
