package latihan.fundamental.percabangan;

public class PercabanganInt {
	public static void main(String[] args) {
		
//		BUGS ada pada operator pembanding, karena angka 10 termasuk Bilangan genap = 10, bukan < dari maupun > dari
// 		pada flow tertulis x%2=0 sedangkan pada program eror
//		kode program yang benar pada modulus seharusnya ditulis x%2==0
//		harus konfirmasi dengan user apakah kode program harus benar-benar sesuai dengan flow 
		
//		deklarasi
		int x = 10;
		
//		tipe data
		if(x > 10) {
			if(x%2==0) {
				System.out.println("Bilangan Genap > 10");
			} else {
				System.out.println("Bilangan Ganjil > 10");
			}
		} else {
			if(x%2==0) {
				System.out.println("Bilangan Genap < 10");
			} else {
				System.out.println("Bilangan Ganjil < 10");
			}
		}
	}
}
