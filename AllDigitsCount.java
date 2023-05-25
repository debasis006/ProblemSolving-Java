import java.io.*;
import  java.util.*;

// Read only region start
public class AllDigitsCount
{

	public int allDigitsCount(int input1){
		// Read only region end
		// Write code here...
		ArrayList<Integer>arr=new ArrayList<Integer>();
		while(input1>0)
		{
			int rem=input1%10;
			arr.add(rem);
			input1=input1/10;
		}
        Set<Integer>s=new HashSet<>();
        s.a
        s.size()
		return arr.size();
	}
}