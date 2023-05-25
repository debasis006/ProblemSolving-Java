import java.io.*;
import  java.util.*;

// Read only region start
public class EvenOddDigitsSum
{

	public int evenOddDigitsSum(int input1,String input2){
		// Read only region end
		// Write code here...
		String s=Integer.toString(input1);
		char []ch=s.toCharArray();
		int sumOdd=0,sumEven=0;
		if(input2.equals("odd"))
		{
			for(int i=0;i<ch.length;i++)
			{
				if(Integer.parseInt(String.valueOf(ch[i]))%2!=0)
					sumOdd+=Integer.parseInt(String.valueOf(ch[i]));
			}
			return sumOdd;
		}
		else
		{
			for(int i=0;i<ch.length;i++)
			{
				if(Integer.parseInt(String.valueOf(ch[i]))%2==0)
					sumEven+=Integer.parseInt(String.valueOf(ch[i]));
			}
			return sumEven;
		}
		
	}
}