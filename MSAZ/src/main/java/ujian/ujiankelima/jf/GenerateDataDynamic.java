 package ujian.ujiankelima.jf;

import java.util.Random;

public class GenerateDataDynamic {
	
	static Random rdm = new Random();

	public static void main(String[] args) {
		int hasil = rdm.nextInt(5, 50);
		int awal = 0;
		int akhir = 0;
		
		do {
			awal = rdm.nextInt(1, 500);
			akhir = rdm.nextInt(1, 500);
		}while(awal>akhir);
		System.out.println("=======================");
		System.out.println("======== FIRST ========");
		System.out.println("=======================");
		System.out.println("=== Random Integer ===");
		System.out.println("=======================");
		intRandom(hasil, awal, akhir);
		System.out.println("=======================\n");
		
		System.out.println("======================="); 
		System.out.println("==== Random Double ====");
		System.out.println("=======================");
		doubRandom(hasil, awal, akhir);
		System.out.println("=======================\n");
	}
	
	public static void intRandom(int jumlahData, int indexAwal, int indexAkhir) {
		System.out.println("Jumlah Data: " + jumlahData);
		for(int i=0; i<jumlahData; i++) {
			int intRand = rdm.nextInt(indexAwal, indexAkhir);
			System.out.println("==========================================");
			System.out.println("Data ke - " +i+ " = " + intRand);
		}
	}
	
	public static void doubRandom(int jumlahData, int indexAwal, int indexAkhir) {
		System.out.println("Jumlah Data: " + jumlahData);
		for(int i=0; i<jumlahData; i++) {
			double intRand = rdm.nextDouble(indexAwal, indexAkhir);
			System.out.println("==========================================");
			System.out.println("Data ke - " +i+ " = " + intRand);
		}
	}

}
