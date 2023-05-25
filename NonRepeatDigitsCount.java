import java.io.*;
import  java.util.*;

// Read only region start
public class NonRepeatDigitsCount
{

	public int nonRepeatDigitsCount(int input1){
		// Read only region end
		// Write code here...
		ArrayList<Integer>arr=new ArrayList<Integer>();
		String s=Integer.toString(input1);
		char []ch=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			int count=0;
			for(int j=0;j<ch.length;j++)
			{
				int val1=Integer.parseInt(String.valueOf(ch[j]));
				int val2=Integer.parseInt(String.valueOf(ch[i]));
				if(val1==val2)
					count++;
			}
			if(count==1)
				arr.add((int)ch[i]);
		}
		return arr.size();
	}
}