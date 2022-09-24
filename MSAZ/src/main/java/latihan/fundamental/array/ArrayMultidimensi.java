package latihan.fundamental.array;

public class ArrayMultidimensi {

	public static void main(String[] args) {
		int [][] angkaKu = {{1,2,3,4},{5,6,7}};
		int x = angkaKu[0][2];
		System.out.println(x);
		
		int [][] myNumbers = {{1,2,3,4},{5,6,7}};
		for(int i=0;i<myNumbers.length;i++)
		{
			for(int j=0;j<myNumbers[i].length;j++)
			{
				System.out.print(myNumbers[i][j]);
			}
			System.out.println();
		}
		
		int [][] myArrOne = new int [1][4];
		myArrOne[0][0] = 3;
		myArrOne[0][1] = 9;
		myArrOne[0][2] = 2;
		myArrOne[0][3] = 8;
		
		for(int i=0;i<myArrOne.length;i++)
		{
			for(int j=0;j<myArrOne[i].length;j++)
			{
				System.out.print(myArrOne[i][j]+",");
			}
		}
	}
}