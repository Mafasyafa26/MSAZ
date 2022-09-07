package ujian.ujiankedua;

public class Geometri {
	
	public int luasPersegiExpect(int a) {
		int hasil = a*a;
		System.out.println("INI HASIL LUAS PERSEGI EXPECT DENGAN PANJANG SISI " +a+ " = "  +hasil);
		return hasil;
	}
	
	public int luasPersegiActual(int x) {
		int hasil = (x*(x/x)*x);
		System.out.println("INI HASIL LUAS PERSEGI ACTUAL DENGAN PANJANG SISI " +x+ " = "  +hasil);
		return hasil;
	}
	
	public double luasSegitigaExpect(int a, int b) {
		double hasil = (a*b)/2;
		System.out.println("INI HASIL LUAS SEGITIGA EXPECT DENGAN PANJANG ALAS = " +a+ " dan TINGGI = " +b+ " HASILNYA : "  +hasil);
		return hasil;
	}
	
	public double luasSegitigaActual(int a, int b) {
		double hasil = ((a*b)/2 * ((a/a)*(b/b)));
		System.out.println("INI HASIL LUAS SEGITIGA ACTUAL DENGAN PANJANG ALAS = " +a+ " dan TINGGI = " +b+ " HASILNYA : "  +hasil);
		return hasil;
	}
	
	public double luasTrapesiumExpect(double a, double b, double t) {
		double hasil = ((a*b)*t)/2;
		System.out.println("INI HASIL LUAS TRAPESIUM EXPECT DENGAN PANJANG SISI = " +a+ " , " +b+ " dan TINGGI = " +t+ " HASILNYA : "  +hasil);
		return hasil;
	}
	
	public double luasTrapesiumActual(double a, double b, double t) {
		double hasil = 0.5*t*(a*b);
		System.out.println("INI HASIL LUAS TRAPESIUM ACTUAL DENGAN PANJANG SISI = " +a+ " , " +b+ " dan TINGGI = " +t+ " HASILNYA : "  +hasil);
		return hasil;
	}


}
