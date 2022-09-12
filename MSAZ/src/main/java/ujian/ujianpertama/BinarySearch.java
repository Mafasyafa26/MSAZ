package ujian.ujianpertama;

public class BinarySearch {
	public static void main(String[] args) {

		int keyword = 88;
//		HASIL -> 88 FOUNDED in position 5 and INDEX 4
		
		int [] val = {66,77,80,84,88,99,100};//DATA
		int low  = 0;
        int high = val.length-1; //7
        int med  = 0;        
        boolean status = false;

        while(low<=high)
//        	0 <= 6
//        	4 <= 6
//        	4 <= 4
        {
            med = (low+high)/2;
//            (0 + 6) / 2 -> 3 (84)
//            (4 + 6) / 2 -> 5 (99)
//            (4 + 4) / 2 -> 4 (88)

            //checking found or not
            if(keyword==val[med])
//            	88 = 84 -> false
//            	88 = 89 -> false 
//            	88 = 88 -> true
            
            {//data found
                System.out.println(keyword+" FOUNDED in position "+(med+1)+" and INDEX "+med);
                status=true;
                break;
//                kalau tidak break maka akan looping lagi, karena = 4 
        
            }
            else
            {
                //data not found
                //to split arr less or greater than key
                
            	if(keyword>val[med])
//                	88>84 -> true
//            		88>99 -> false
            		
                {
                    //found the data greater than median
                    
            		low = med + 1;
//                    0 = 3 + 1 -> 4

                }
                else
                {
                    //if media greater than the keyword
                	
                    high = med - 1;
//                     0 = 5 - 1 -> 4

                }
            }
        }//END OF WHILE PROCESS

        //IF DATA NOT FOUND
        if(!status)
        {
            System.out.println(keyword+" NOT FOUND !!");
        }

	}
}
