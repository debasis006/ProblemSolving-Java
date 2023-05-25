import java.io.*;
import  java.util.*;

// Read only region start
public class sumOfSumsOfDigits
{
	//https://tests.mettl.com/v2/authenticateKey/1vzawmc2yo
	public int sumOfSumsOfDigits(int input1){
		// Read only region end
		// Write code here...
		String s=Integer.toString(input1);
		char []ch=s.toCharArray();
		int sum=0;
		for(int i=0;i<ch.length;i++)
		{
			for(int j=i;j<ch.length;j++)
			{
				sum+=Integer.parseInt(String.valueOf(ch[j]));
			}
		}
		return sum;
	}
}

