package latihan.fundamental.array;

import java.util.ArrayList;

import latihan.fundamental.oop.Bulean;

public class BubbleSort {

    static StringBuilder sBuild = new StringBuilder();

//    static String bef = "";
    public static void main(String[] args) {

        int val[] = {99,76,87,69,80};
        bubbleSortASCInt(val);
        String strBuble = showStartEnd(val, null);
        String strBub   = ""+strBuble;
        Object obj = new Object();
        obj = 12.0;
        if(obj instanceof String)
        {
        	System.out.println("INI STRING");
        }
        else if (obj instanceof Double)
        {
        	System.out.println("INI DOUBLE");
        }
        else if(obj instanceof Integer)
        {
        	System.out.println("INI INTEGER");
        }
//        strBuble
        showStartEnd(val, null);
        showStartEnd(val, null);
        bubbleSortDESCInt(val);
        Bulean sis = new Bulean();
        String prosesStartEnd = showStartEnd(val,"");
//        	prosesStartEnd.sub
        double ipk[] = {1.4,4.0,2.4,3.4};
        bubbleSortASCDouble(ipk);
        bubbleSortDESCDouble(ipk);

        String []name = {"N","A","M","E","L","E","S","S"};
        bubbleSortASCString(name);
        bubbleSortDESCString(name);

        char []characters = {'V','K','Z','X','H','M','C','N'};
        bubbleSortASCChar(characters);
        bubbleSortDESCChar(characters);

    }
    
    public static void showStartEnd(int [] nums, 
    			String aftBef, 
    				double doParse, 
    					boolean isBol)
    {
    	
    }
    
    static void showStartEnd(int [] nums, String aftBef, double doParse) 
    		throws InterruptedException
    {
    	Thread.sleep(0);
    }
    public static String showStartEnd(int [] nums, String aftBef)
    {
//    	System sis = System.setSecurityManager();
    	String strXY = "";
    	sBuild.setLength(0);
        //before
        System.out.println("====="+aftBef+"=====");
        for (int num:nums)
        {
        	strXY = sBuild.append(num).append(",").toString();
        }
        System.out.print(strXY.substring(0,strXY.length()-1));
        
        return strXY;
    }
    
    public static void bubbleSortASCInt(int[] nums){
        String bef = "";
        String aft = "";
        int loopNext = 0;
        int container = 0;
//        showStartEnd(nums, "BEFORE");
        //logic
        for (int i =0 ; i < nums.length ; i++ )
        {
            loopNext = 1;
            for (int j=0 ; j < nums.length-1 ; j++)
            {
                //if the current value is greater than the next value
                if(nums[j]>nums[loopNext])
                {
                    //then swap
                    container = nums[j];
                    nums[j]=nums[loopNext];
                    nums[loopNext] = container;
                }
                loopNext++;
            }
        }
        showStartEnd(nums, "AFTER");        
    }

    public static void bubbleSortASCDouble(double[] nums)
    {
        String bef = "";
        String aft = "";
        int loopNext = 0;
        double container = 0;

        sBuild.setLength(0);
        //before
        System.out.println("\n#####BEFORE#####");
        for (double num:nums)
        {
            bef = sBuild.append(num).append(",").toString();
        }
        System.out.print(bef.substring(0,bef.length()-1));

        //logic
        for (int i =0 ; i < nums.length ; i++ )
        {
            loopNext = 1;
            for (int j=0 ; j < nums.length-1 ; j++)
            {
                //if the current value is greater than the next value
                if(nums[j]>nums[loopNext])
                {
                    //then swap
                    container = nums[j];
                    nums[j]=nums[loopNext];
                    nums[loopNext] = container;
                }
                loopNext++;
            }
        }

        sBuild.setLength(0);
        //after
        System.out.println("\n#####AFTER######");
        for (double num:nums)
        {
            aft = sBuild.append(num).append(",").toString();
        }
        System.out.print(aft.substring(0,aft.length()-1));
    }

    public static void bubbleSortASCString(String [] nums)
    {
        String bef = "";
        String aft = "";
        int loopNext = 0;
        String container = "";

        sBuild.setLength(0);
        //before
        System.out.println("\n==BEFORE==");
        for (String num:nums)
        {
            bef = sBuild.append(num).append(",").toString();
        }
        System.out.print(bef.substring(0,bef.length()-1));

        //logic
        for (int i =0 ; i < nums.length ; i++ )
        {
            loopNext = 1;
            for (int j=0 ; j < nums.length-1 ; j++)
            {
                //if the current value is greater than the next value
                if(nums[j].compareTo(nums[loopNext]) > 0)
                {
                    //then swap
                    container = nums[j];
                    nums[j]=nums[loopNext];
                    nums[loopNext] = container;
                }
                loopNext++;
            }
        }

        sBuild.setLength(0);
        //after
        System.out.println("\n==AFTER==");
        for (String num:nums)
        {
            aft = sBuild.append(num).append(",").toString();
        }
        System.out.print(aft.substring(0,aft.length()-1));
    }

    public static void bubbleSortASCChar(char [] nums)
    {
        String bef = "";
        String aft = "";
        int loopNext = 0;
        char container = 'a';

        sBuild.setLength(0);
        //before
        System.out.println("\n==BEFORE==");
        for (char num:nums)
        {
            bef = sBuild.append(num).append(",").toString();
        }
        System.out.print(bef.substring(0,bef.length()-1));

        //logic
        for (int i =0 ; i < nums.length ; i++ )
        {
            loopNext = 1;
            for (int j=0 ; j < nums.length-1 ; j++)
            {
                //if the current value is greater than the next value
                if(nums[j] > nums[loopNext])
                {
                    //then swap
                    container = nums[j];
                    nums[j]=nums[loopNext];
                    nums[loopNext] = container;
                }
                loopNext++;
            }
        }

        sBuild.setLength(0);
        //after
        System.out.println("\n==AFTER==");
        for (char num:nums)
        {
            aft = sBuild.append(num).append(",").toString();
        }
        System.out.print(aft.substring(0,aft.length()-1));
    }

    public static void bubbleSortDESCInt(int[] nums){
        String bef = "";
        String aft = "";
        int loopNext = 0;
        int container = 0;

        sBuild.setLength(0);
        //before
        System.out.println("\n==BEFORE==");
        for (int num:nums)
        {
            bef = sBuild.append(num).append(",").toString();
        }
        System.out.print(bef.substring(0,bef.length()-1));

        //logic
        for (int i =0 ; i < nums.length ; i++ )
        {
            loopNext = 1;
            for (int j=0 ; j < nums.length-1 ; j++)
            {
                //if the current value is greater than the next value
                if(nums[j]<nums[loopNext])
                {
                    //then swap
                    container = nums[j];
                    nums[j]=nums[loopNext];
                    nums[loopNext] = container;
                }
                loopNext++;
            }
        }

        sBuild.setLength(0);
        //after
        System.out.println("\n==AFTER==");
        for (int num:nums)
        {
            aft = sBuild.append(num).append(",").toString();
        }
        System.out.print(aft.substring(0,aft.length()-1));
    }

    public static void bubbleSortDESCDouble(double[] nums)
    {
        String bef = "";
        String aft = "";
        int loopNext = 0;
        double container = 0;

        sBuild.setLength(0);
        //before
        System.out.println("\n==BEFORE==");
        for (double num:nums)
        {
            bef = sBuild.append(num).append(",").toString();
        }
        System.out.print(bef.substring(0,bef.length()-1));

        //logic
        for (int i =0 ; i < nums.length ; i++ )
        {
            loopNext = 1;
            for (int j=0 ; j < nums.length-1 ; j++)
            {
                //if the current value is greater than the next value
                if(nums[j]<nums[loopNext])
                {
                    //then swap
                    container = nums[j];
                    nums[j]=nums[loopNext];
                    nums[loopNext] = container;
                }
                loopNext++;
            }
        }

        sBuild.setLength(0);
        //after
        System.out.println("\n==AFTER==");
        for (double num:nums)
        {
            aft = sBuild.append(num).append(",").toString();
        }
        System.out.print(aft.substring(0,aft.length()-1));
    }

    public static void bubbleSortDESCString(String [] nums)
    {
        String bef = "";
        String aft = "";
        int loopNext = 0;
        String container = "";

        sBuild.setLength(0);
        //before
        System.out.println("\n==BEFORE==");
        for (String num:nums)
        {
            bef = sBuild.append(num).append(",").toString();
        }
        System.out.print(bef.substring(0,bef.length()-1));

        //logic
        for (int i =0 ; i < nums.length ; i++ )
        {
            loopNext = 1;
            for (int j=0 ; j < nums.length-1 ; j++)
            {
                //if the current value is greater than the next value
                if(nums[j].compareTo(nums[loopNext]) < 0)
                {
                    //then swap
                    container = nums[j];
                    nums[j]=nums[loopNext];
                    nums[loopNext] = container;
                }
                loopNext++;
            }
        }

        sBuild.setLength(0);
        //after
        System.out.println("\n==AFTER==");
        for (String num:nums)
        {
            aft = sBuild.append(num).append(",").toString();
        }
        System.out.print(aft.substring(0,aft.length()-1));
    }

    public static void bubbleSortDESCChar(char [] nums)
    {
        String bef = "";
        String aft = "";
        int loopNext = 0;
        char container = 'a';

        sBuild.setLength(0);
        //before
        System.out.println("\n==BEFORE==");
        for (char num:nums)
        {
            bef = sBuild.append(num).append(",").toString();
        }
        System.out.print(bef.substring(0,bef.length()-1));

        //logic
        for (int i =0 ; i < nums.length ; i++ )
        {
            loopNext = 1;
            for (int j=0 ; j < nums.length-1 ; j++)
            {
                //if the current value is greater than the next value
                if(nums[j] < nums[loopNext])
                {
                    //then swap
                    container = nums[j];
                    nums[j]=nums[loopNext];
                    nums[loopNext] = container;
                }
                loopNext++;
            }
        }

        sBuild.setLength(0);
        //after
        System.out.println("\n==AFTER==");
        for (char num:nums)
        {
            aft = sBuild.append(num).append(",").toString();
        }
        System.out.print(aft.substring(0,aft.length()-1));
    }
}