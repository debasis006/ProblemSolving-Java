import java.io.*;
import  java.util.*;

// Read only region start
public class IsStepNumber
{

	public String isStepNumber(int input1){
		// Read only region end
		// Write code here...
		String s=Integer.toString(input1);
		String output="";
		if(s.length()==1)
		{
			output=String.valueOf(input1)+"-false";
		}
		else
		{
			for(int i=0;i<s.length()-1;i++)
			{
				int fisrt=Integer.parseInt(String.valueOf(s.charAt(i)));
				int second=Integer.parseInt(String.valueOf(s.charAt(i+1)));
				int sum=fisrt-second;
				if(sum!=1||sum!=-1)
				{
					output=String.valueOf(input1)+"-false";
				}
				if(sum==1||sum==-1)
				{
					output=String.valueOf(input1)+"-true";
				}
				
			}
		}
		return output;
	}
}