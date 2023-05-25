import java.io.*;
import  java.util.*;

// Read only region start
public class NFactorial
{

	public int nFactorial(int input1){
		// Read only region end
		// Write code here...
		//int fact=1;
		if(input1==0)
		{
			return 1;
		}
		else
			return input1*nFactorial(input1-1);
	}
}
