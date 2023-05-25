import java.io.*;
import  java.util.*;
import java.util.Collection;

// Read only region start
public class FindPassword
{

	public static int findPassword(int input1,int input2,int input3,int input4,int input5){
		// Read only region end
		// Write code here...
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(input1);
        arr.add(input2);
        arr.add(input3);
        arr.add(input4);
        arr.add(input5);

        int stableSum=0,unStableSum=0,output;
        for(int i=0;i<arr.size();i++)
        {
            if(isStableOrNot(arr.get(i)))
            {
                stableSum=stableSum+arr.get(i);
            }
            else
                unStableSum=unStableSum+arr.get(i);
        }
        // System.out.println("sumOfStable:"+stableSum);
        // System.out.println("sumOfUnstable:"+unStableSum);
        // System.out.println("isStableOrNot: " + isStableOrNot(input1) + isStableOrNot(input2) + isStableOrNot(input3) + isStableOrNot(input4) + isStableOrNot(input5));
        output=stableSum-unStableSum;
        return output;

	}
    
    public static boolean isStableOrNot(int n)
    {
        boolean isStable=true;
        String str=Integer.toString(n);
        int frequency[]=new int[10];

        //System.out.println(frequency);
        int maxFreq=0;
        for(int i=0;i<str.length();i++)
        {
            frequency[Integer.parseInt(String.valueOf(str.charAt(i)))]++;// 2nd index ++
            // System.out.println(frequency[Integer.parseInt(String.valueOf(str.charAt(i)))]);
        }
        //System.out.println(Arrays.toString(frequency));

        for(int i=0;i<10;i++)
        {
            if(frequency[i]>0)
            {
                maxFreq=frequency[i];
                break;
            }
        }
        //System.out.println("Maxfreq="+maxFreq);

        for(int i=0;i<10;i++)
        {
            if(frequency[i]!=0&&frequency[i]!=maxFreq)
            {
                isStable=false;
                break;
            }
        }
        //System.out.println("isStable="+isStable);
        return isStable;
    }
    

    public static void main(String[] args) {
        System.out.println(findPassword(12, 1313, 122, 678, 898));
    }

}