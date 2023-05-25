import java.io.*;
import  java.util.*;



// Read only region start
public class FindPassword_1
{

	public int findPassword(int input1,int input2,int input3,int input4,int input5){
		// Read only region end
		// Write code here...
		ArrayList<Integer>arr=new ArrayList<>();
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
			{
				unStableSum=unStableSum+arr.get(i);
			}
		}
		output=stableSum-unStableSum;
		return output;
	}
	public static boolean isStableOrNot(int n)
	{
		boolean isStable=true;
		String str=Integer.toString(n);
		int frequency[]=new int[10];

		int maxFreq=0;
		for(int i=0;i<str.length();i++)
		{
			frequency[Integer.parseInt(String.valueOf(str.charAt(i)))]++;
		}
		
		for(int i=0;i<10;i++)
		{
			if(frequency[i]>0)
			{
				maxFreq=frequency[i];
				break;
			}
		}
		
		for(int i=0;i<10;i++)
		{
			if(frequency[i]!=0 && frequency[i]!=maxFreq)
			{
				isStable=false;
				break;
			}
		}
		return isStable;
	}
}