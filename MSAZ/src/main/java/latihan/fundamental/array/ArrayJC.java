package latihan.fundamental.array;

import java.util.Scanner;

public class ArrayJC {

	
	public static void main(String[] args) {
 	    Scanner scan = new Scanner(System.in);
	    String[] array = new String[3];// ARRAY NYA PUNYA DAYA TAMPUNG 3 TOPLES
	    int [] intArr = new int[4];
//	    
//	    intArr[0] = scan.nextInt();//1
//	    intArr[1] = scan.nextInt();//2
//	    intArr[2] = scan.nextInt();//3
//	    intArr[3] = scan.nextInt();//4
////	    intArr[5] = scan.nextInt();//4
//	    
//	    System.out.println(intArr[5]);
//	     
//	    double [] doubArr = new double[3];//0,1,2,3
//	    int [] intArrExample = {4,3,2,1};
//	    int x =0;
//	    x=4;
//	    x=10;
//	    System.out.println("Kapasitas Array ke 1 "+intArr.length);
	    
//	    intArr = new int[7];//{0,0,0,0,0,0,0}
//	    
//	    intArr[0] = scan.nextInt();//1
//	    intArr[1] = scan.nextInt();//2
//	    intArr[2] = scan.nextInt();//3
//	    intArr[3] = scan.nextInt();//4
//	    intArr[5] = scan.nextInt();//5
//	    System.out.println(intArr[4]);
//	    for(int i=0;i<intArr.length;i++)
//	    {
//	    	//7<=7 , 0-1-2-3-4-5-6-7
//	    	//PROSES PERTAMA i = 0
//	    	//PROSES KEDUA   i = 1
//	    	//PROSES KETIGA  i = 2
//	    	//PROSES KEEMPAT i = 3
//	    	//PROSES KELIMA  i = 4 (TIDAK TERISI)
//	    	//PROSES KEENAM  i = 5 
//	    	//PROSES KETUJUH i = 6 (TIDAK TERISI)
//	    	
//	    	if(i<4 || i>6)
//	    	{
//	    		intArr[i] = scan.nextInt();	    		
//	    	}
//	    }
//	    String [] strArrays = new String[6];//{"5","","","","",""}
//	    strArrays[0]=scan.next();
//	    strArrays[1]=scan.next();
//	    strArrays[2]=scan.next();
//	    strArrays[3]=scan.next();
//	    strArrays[4]=scan.next();
//	    strArrays[5]=scan.next();
//	    for(int i=0;i<strArrays.length;i++)
//	    {
//	    	System.out.println("Evan & Bana & Selvia & Zae "+strArrays[i]);
//	    }
	    

	    String [][] strArr = new String[2][10];//{{"",""},{"",""}}
	    strArr[0][0]=scan.next();
	    strArr[0][1]=scan.next();
	    strArr[0][2]=scan.next();
	    strArr[1][0]=scan.next();
	    strArr[1][1]=scan.next();	    
	    strArr[1][2]=scan.next();
//	    Evan,Bana
//	    Zae,Paul

	    int intLoop=0;
	    for(int i=0;i<strArr.length;i++)
	    {
	    	System.out.println();
	    	for(int j=0;j<strArr[i].length;j++)
	    	{
	    		System.out.print(strArr[i][j]+" ,");
	    	}
	    }
	    
	    
//	    int intLoop=0;
//	    for(String i : strArrays)
//	    {	    
//	    	System.out.println(i);
//	    }
//	    int intU = 0;
//	    intU = 10;
	    
//	    System.out.println(intU);
	    
//	    System.out.println("Kapasitas Array ke 2 "+intArr.length);
//	    int [] intArrTwo = new int[9];
//	    CTRL + /
//	    System.out.print("Adik saya 5 "+(5+9));
	    //Adik saya 5 14
//	    String a = "Dono";
//	    String b = "Doyok";
//	    a.compa
//	    {"Abed","Evan","Bana","Selvia"};
//	    {"Abed","Bana","Evan","Selvia"}
//	    blok - 1 - intArr
//	    blok - 2 - intArr
//	    blok - 3 - intArrTwo
	    
//	    int [] intArr = {3,2,1,4};
	    
//	    int intX = 0;
//	    intArr.
//	    intArr.
//	    for(int index=0; index<array.length; index++){
//	        array[index] = scan.next();
//	    } 
//	    
//	    for(String i : array){
//	        System.out.print(i+" ");
//	    }
	}
}