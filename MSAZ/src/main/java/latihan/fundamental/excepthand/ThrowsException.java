package latihan.fundamental.excepthand;

import java.io.IOException;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowsException {

	public static void main(String[] args)  throws IndexOutOfBoundsException, InterruptedException{

		mathError();
		
			try {
				
				eksekusi();
			}
			catch(Exception e)
			{
				System.out.println("SAYA HANDLING NULL");				
				
			}

			System.out.println("OK LANJUTAN");
			System.out.println("OK OK");

	}
	
	static void eksekusi()throws ArithmeticException,NullPointerException,NumberFormatException{
		Scanner scn = new Scanner(System.in);
		scn.nextInt();
	}
	
	static void mathError() throws IndexOutOfBoundsException, InterruptedException{
		
		int [] intC = {1,2,3};
		try {
			System.out.println(intC[3]);
		}
		catch(Exception e)
		{
			System.out.println("OK JALAN !!");
		}
//		int x = 1/0;
		Thread.sleep(100);
//		System.out.println("OK INTERUPT");
//		int x = 1/0;
//		try {
//			
//		}
//		catch(Exception e)
//		{
//			System.out.println("INI PASTI DIEKSEKUSI "+e);
//		}
	}
}