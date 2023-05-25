import java.io.*;
import  java.util.*;

// Read only region start
public class UniqueDigitsCount
{

	public int uniqueDigitsCount(int input1){
		// Read only region end
		// Write code here...
		Set<Integer>s=new HashSet<>();
    	while(input1>0)
    	{
    	    int rem=input1%10;
    	    s.add(rem);
    	    input1=input1/10;
    	}
    	return s.size();
	}
}
