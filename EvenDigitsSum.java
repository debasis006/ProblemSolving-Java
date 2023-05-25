import java.io.*;
import  java.util.*;

// Read only region start
public class EvenDigitsSum
{

	public int evenDigitsSum(int input1){
		// Read only region end
		// Write code here...
		String s=Integer.toString(input1);
		char []ch=s.toCharArray();
		int sum=0;
		for(int i=0;i<ch.length;i++)
		{
			if(Integer.parseInt(String.valueOf(ch[i]))%2==0)
				sum+=Integer.parseInt(String.valueOf(ch[i]));
		}
		return sum;
	}
}