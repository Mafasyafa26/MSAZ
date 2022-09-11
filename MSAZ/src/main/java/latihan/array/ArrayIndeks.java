package latihan.array;

public class ArrayIndeks {
	public static void main(String args[]) {
		int[] intArr = {3,8,5,2,1,9,10};
		int intB = 1;
		boolean isFound = true;
		
		for(int i=0; i < intArr.length; i++) {
			if(intB==intArr[i]) {
				System.out.print("Angka " +intB+ " sudah ditemukan, pada indeks ke - " +i);
				isFound = false;
				break;
			}
		}
		
		if(isFound) {
			System.out.print("Angka " +intB+ " tidak ditemukan!!");
		}
	}
}

