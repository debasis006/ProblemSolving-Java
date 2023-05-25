import java.io.*;
import  java.util.*;

// Read only region start
public class IsPalinNum
{

	public int IsPalinNum(int input1){
		// Read only region end
		int digit=0,temp=input1;
		while(input1>0)
		{
			digit=(digit*10)+input1%10;
			input1/=10;
		}
		if(digit==temp)
			return 2;
		else
			return 1;
		
	}
}