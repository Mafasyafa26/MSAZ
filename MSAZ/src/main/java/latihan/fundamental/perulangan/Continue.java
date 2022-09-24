package latihan.fundamental.perulangan;

public class Continue {
	public static void main(String args[]) {
		
//		for(int i = 0; i < 4; i++) {
//			for(int j = 0; j < 5; j++) {
//				if(j==3) {
//					System.out.println(i+ " Ini yang terlompati " +j);
//					continue;
//				}
//				System.out.println(i+ " 1 kali loop ke + " +j);
//			}
//		}
		
		
		int sum = 0;
		int item = 0;
		while(item<5) {
			item++;
			sum += item;
			if(sum>=6) {
			System.out.println("Berhenti disini proses ke - " +item);
			continue;
		}
			System.out.println("1 kali loop ke - " +item);
		
	}
}
}
