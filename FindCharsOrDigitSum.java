import java.io.*;
import  java.util.*;

// Read only region start
public class FindCharsOrDigitSum
{

	public String findCharsOrDigitSum(String input1,int input2){
		// Read only region end
		// Write code here...
		char ch[]=input1.toCharArray();
		int sum=0,flag=0;
		String s="";
		String str="NULL";
		if(input1.isEmpty()&&(input2==1||input2==0))
		{
			s=str;
		}
		else
		{
			if(input2==0&&input1!=null)
			{
				for(int i=0;i<ch.length;i++)
				{
					if(Character.isDigit(ch[i]))
					{
						flag=1;
						sum=sum+Integer.parseInt(String.valueOf(ch[i]));
					}
				}
				if(flag==0)
				{
					s=s+"ZERO";
				}
				else if(flag!=0)
				{
					s=s+Integer.toString(sum);
				}
			}
			else if(input2==1&&input1!=null)
			{
				for(int i=0;i<ch.length;i++)
				{
					if(Character.isAlphabetic(ch[i]))
					{
						flag=1;
						s=s+ch[i];
					}
				}
				if(flag==0)
				{
					s=s+"ZERO";
				}
			}
		}
		return s;
	}
}