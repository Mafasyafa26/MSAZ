package latihan.fundamental.array;

public class TestArray {

	public static void main(String[] args) {
		String [][] strArr = {{"ABC","DEF","GHI"},{"JKL","MNO","PQR","STU"}};		
//		System.out.println(strArr[0][2]);
		for(int i=0;i<strArr.length;i++)
		{
			for(int j=0;j<strArr[i].length;j++)
			{
				System.out.println("["+i+"]"+"["+j+"]"+" BERNILAI "+strArr[i][j]);
//				[][] NILAINYA
//				[1][2] nilainya
			}
			System.out.println("========");
		}
	}
}