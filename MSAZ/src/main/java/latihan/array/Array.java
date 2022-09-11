package latihan.array;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [][] strArr = {{"ABC", "DEF", "GHI"},{"JKL", "MNO", "PQR", "STU"}};
		String tampilan = null;
		
//		diindexkan
		for(int i = 0; i <= strArr.length; i++) {
			for(int j = 0; j <= strArr.length; j++) {
				System.out.println("{" +i+ "]" + "[" +j+ "]" + "BERNILAI " +strArr[i][j]);
			}
		}
		
		
	}
}
