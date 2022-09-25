package ujian.ujiankelima.jf;

import java.util.Random;
import java.util.Scanner;

public class MethodMath {
	public static void main(String[] args) {
		
		Random rdm = new Random();
		Scanner scan = new Scanner(System.in);
		
		boolean isBool = true;
		String strJawab = "";
		String strInput;
		
		do {
			try {
				System.out.print("=== Input nilai: ");
				strInput = scan.nextLine();
				int intInput = Integer.parseInt(strInput);
				System.out.println("=======================");
				System.out.println("Math absolute = "+Math.abs(intInput));
				System.out.println("Math akar = "+Math.sqrt(intInput));
				System.out.println("Math bulat atas = "+Math.ceil(intInput));
				System.out.println("Math expired = "+Math.exp(intInput));
				System.out.println("Math cosinus = " + Math.cos(intInput));
				System.out.println("=======================");
				System.out.print("Isi lagi (ya/tidak): ");
				strJawab = scan.nextLine();
				System.out.println();
			} catch (NumberFormatException e) {
				System.out.println(e);
			}
		}while(strJawab.equalsIgnoreCase("ya"));
		
		System.out.println("== !!! PROGRAM STOP !!! ===");
	}
}
