package latihan.fundamental.array;

public class BinarySearch {
	public static void main(String[] args) {
        int [] val = {66,77,80,84,88,99,100};//DATA GANJIL
        binarySearchInt(val,88);
    }	


    public static void binarySearchInt(int[] nums,int keyword)
    {
        int low  = 0;
        int high = nums.length-1;
        int med  = 0;
        boolean status = false;

        while(low<=high)
        {
            med = (low+high)/2;

            //checking found or not
            if(keyword==nums[med])
            {//data found
                System.out.println(keyword+" FOUNDED in position "+(med+1)+" and INDEX "+med);
                status=true;
                break;
            }
            else
            {
                //data not found
                //to split arr less or greater than key
                if(keyword>nums[med])
                {
                    //found the data greater than median
                    low = med + 1;

                }
                else
                {
                    //if media greater than the keyword
                    high = med - 1;

                }
            }
        }//END OF WHILE PROCESS

        //IF DATA NOT FOUND
        if(!status)
        {
            System.out.println(keyword+" NOT FOUND !!");
        }

    }
    
    public static void binarySearchString(String[] nums,String keyword)
    {
        int low  = 0;
        int high = nums.length-1;
        int med  = 0;
        boolean status = false;

        while(low<=high)
        {
            med = (low+high)/2;

            //checking found or not
            if(keyword.equalsIgnoreCase(nums[med]))
            {//data found
                System.out.println(keyword+" FOUNDED in position "+(med+1)+" and INDEX "+med);
                status=true;
                break;
            }else
            {
                //data not found
                //to split arr less or greater than key (For String it must be same each other, so make it lower case first)
                if((keyword.toLowerCase()).compareTo(nums[med].toLowerCase())>0)
                {
                    //found the data greater than median
                    low = med + 1;
                }else
                {
                    //if media greater than the keyword
                    high = med - 1;

                }
            }
        }//END OF WHILE PROCESS

        //IF DATA NOT FOUND
        if(!status)
        {
            System.out.println(keyword+" NOT FOUND !!");
        }
    }//END OF PROCEDURE binarySearchString

//	public static void main(String[] args) {
//  int [] val = {66,77,80,84,88,99,100};//DATA GANJIL
//  binarySearchInt(val,88);
////  int [] val = {66,77,80,84,88,99};//DATA GENAP
//  
//
////  String name [] ={"Avril","Buddy","Gina","Elton","John"};
////  String name [] ={"John","Elton","Gina","Buddy","Avril"};
////  binarySearchString(name,"gina");
//}
}
