import java.io.*;
import  java.util.*;

// Read only region start
public class NthFibonacci
{

	public long nthFibonacci(int input1){
		// Read only region end
		// Write code here...
		if(input1==1)
			return 0;
		if(input1==2)
			return 1;
		else
			return nthFibonacci(input1-1)+nthFibonacci(input1-2);
	}
} 