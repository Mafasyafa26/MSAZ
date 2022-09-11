package latihan.perulangan;

import java.util.Scanner;

public class DoWhile {
	public static void main(String args[]) {
		int umur = 0;
		Scanner mf = new Scanner(System.in);
		
		do {
			System.out.print("Masukkan umur : ");
			umur = mf.nextInt();
		} while(umur < 1 || umur > 100);
//		1 - 100 akan dicetak
		System.out.println("Umur anda : " +umur);
	}
}

