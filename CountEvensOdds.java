import java.io.*;
import  java.util.*;

// Read only region start
public class CountEvensOdds
{

	public int countEvensOdds(int input1,int input2,int input3,int input4,int input5,String input6){
		// Read only region end
		// Write code here...
		int c=0;
		if(input1%2==0)
			c++;
		if(input2%2==0)
			c++;
		if(input3%2==0)
			c++;
		if(input4%2==0)
			c++;
		if(input5%2==0)
			c++;
		if(input6.equals("even"))
			return c;	
		else
			return 5-c;			
	}
}