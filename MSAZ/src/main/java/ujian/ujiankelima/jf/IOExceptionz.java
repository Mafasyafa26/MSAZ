package ujian.ujiankelima.jf;

import java.io.FileInputStream;
import java.io.IOException;

public class IOExceptionz {
	public static void main(String[] args) throws IOException {
		FileInputStream inputFile = null;	
		try {
			inputFile = new FileInputStream("C:\\Users\\NEXSOFT\\Documents\\Nexsoft\\Mafa.txt");
			inputFile.close();
		}catch(Exception e)
		{
			System.out.println("=======================");
			System.out.println("FILE TIDAK DITEMUKAN!! ");
			System.out.println("=======================");
		}      
		System.out.println("YOK DILANJUT");
    }
}