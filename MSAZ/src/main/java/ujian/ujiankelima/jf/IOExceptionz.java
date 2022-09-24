package ujian.ujiankelima.jf;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOExceptionz {
	public static void main(String[] args) throws IOException {
		FileInputStream inputFile = null;
		BufferedInputStream inputBuff = null;
		byte[] contentOfFile = null;
		FileOutputStream outputFile = null;
		BufferedOutputStream outputBuff = null;		
		try {
			inputFile = new FileInputStream("C:\\Users\\NEXSOFT\\Documents\\Nexsoft\\Mafa.txt");
			inputBuff = new BufferedInputStream(inputFile);
			contentOfFile = inputBuff.readAllBytes();
			outputFile = new FileOutputStream("C:\\Users\\NEXSOFT\\Documents\\Nexsoft\\Mafa.txt");
			outputBuff = new BufferedOutputStream(outputFile);
			outputBuff.write(contentOfFile);
			outputBuff.flush();
			inputFile.close();
	        inputBuff.close();
	        outputFile.close();
	        outputBuff.close();
		}catch(Exception e)
		{
			System.out.println("FILE TIDAK DITEMUKAN!! ");
		}
		System.out.println("LANJUUUUT !!");        
    }
}