package latihan.fundamental.percabangan;

public class Percabangan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		deklarasi
		boolean isLapar=true;
		boolean isHujan=false;
		
//		ketika tidak lapar, proses berakhir
//		ketika lapar, berlanjut ke proses hujan
		
		System.out.println("==== SELAMAT DATANG ====");

		if(isLapar) {
			if(isHujan) {
				System.out.println("Masak sendiri yaaa");
			}else{
				System.out.println("Makan di luar ");
			}
		} else {
			System.out.println("Rebahan");
		}

	}

}
