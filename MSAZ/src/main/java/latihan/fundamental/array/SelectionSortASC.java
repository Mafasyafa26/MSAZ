package latihan.fundamental.array;

public class SelectionSortASC {
	
	static StringBuilder sBuild = new StringBuilder();
	
	public static void main(String[] args) {
        int val[] = {69,89,31,56,99};
        selectionSortASCInt(val);
	}
	
    public static void selectionSortASCInt(int[] nums)
    {
        String bef = "";
        String aft = "";
        int initz = 0;
        int container = 0;

        sBuild.setLength(0);
        //before
        System.out.println("\n==BEFORE==");
        for (int num:nums)//PROSES LOOPING MERANGKAI ARRAY KE VARIABEL bef
        {
            bef = sBuild.append(num).append(",").toString();//INPUT DATA ARRAY 1 PER 1 
        }

        System.out.print(bef.substring(0,bef.length()-1));//MENGHILANGKAN TANDA KOMA TERAKHIR, LALU PRINT ISI VARIABEL bef

        //logic
        for(int i = 0 ; i < nums.length ; i++)
        {
        	System.out.println("\n\n\nPROSES KE "+i);
            initz = i;
            //makes efficient , no need loop for the end of process
            if(i!=nums.length-1)
            {
                for (int j = i ; j < nums.length ; j++)
                {
                    if(nums[initz] > nums[j])
                    {
                        initz = j;// INIT PEMBANDING DI OPER DARI INDEX KURSOR KE INDEX ANGKA TERKECIL
                    }
                }
            }
            container = nums[i];
            nums[i] = nums[initz];
            nums[initz] = container;
            
            sBuild.setLength(0);
            for (int num:nums)
            {
                aft = sBuild.append(num).append(",").toString();
            }
            System.out.print(aft.substring(0,aft.length()-1));            
            
        } //END logic PROCESS
        sBuild.setLength(0);
        //after
        System.out.println("\n\n==AFTER==");
        for (int num:nums)
        {
            aft = sBuild.append(num).append(",").toString();
        }
        System.out.print(aft.substring(0,aft.length()-1));
    }//end of the procedure selectionSortASCInt
}