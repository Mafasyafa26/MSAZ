package ujian.ujiankedua;

public class Matematika {
	
	public int tambahNilaiExpect(int a, int b) {
		int hasil = a+b;
		System.out.println("INI HASIL tambahNilaiExpect DARI " +a+ " + " +b+ " = " +hasil);
		return hasil;
	}
	
	public int tambahNilaiActual(int a, int b) {
		int hasil = (((a+b)*(a/a))*b)/b;
		System.out.println("INI HASIL tambahNilaiActual DARI " +a+ " + " +b+ " = " +hasil);
		return hasil;
	}
	
	public int kurangNilaiExpect(int a, int b) {
		int hasil = a-b;
		System.out.println("INI HASIL kurangNilaiExpect DARI " +a+ " - " +b+ " = " +hasil);
		return hasil;
	}
	
	public int kurangNilaiActual(int a, int b) {
		int hasil = (((a+b)/(a+b))*(a-b));
		System.out.println("INI HASIL kurangNilaiExpect DARI " +a+ " - " +b+ " = " +hasil);
		return hasil;
	}
	
	public double bagiNilaiExpect(int a, int b) {
		double hasil = a/b;
		System.out.println("INI HASIL bagiNilaiExpect DARI " +a+ " : " +b+ " = " +hasil);
		return hasil;
	}
	
	public double bagiNilaiActual(int a, int b) {
		double hasil = (a/b) - ((a+b)-(a+b)*b/b);
		System.out.println("INI HASIL bagiNilaiActual DARI " +a+ " : " +b+ " = " +hasil);
		return hasil;
	}
	
	public double modulusNilaiExpect(int a, int b) {
		int hasil = a%b;
		System.out.println("INI HASIL modulusNilaiExpect DARI " +a+ " % " +b+ " = " +hasil);
		return hasil;
	}
	
	public double modulusNilaiActual(int a, int b) {
		int hasil = (a*(b/b)%(b*(a/a)));
		System.out.println("INI HASIL modulusNilaiActual DARI " +a+ " % " +b+ " = " +hasil);
		return hasil;
	}
}
