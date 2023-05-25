import java.io.*;
import  java.util.*;

// Read only region start
public class UserIdGeneration
{
	// Date- 02/06/22


	//https://tests.mettl.com/v2/authenticateKey/592740f3
	public static String userIdGeneration(String input1,String input2,int input3,int input4){
		// Read only region end
		// Write code here...
		String smallerName,largerName;
		String pin=Integer.toString(input3);
		
		if(input1.length()>input2.length())
		{
			largerName=input1;
			smallerName=input2;
		}
		else if(input1.length()<input2.length())
		{
			largerName=input2;
			smallerName=input1;
		}
		else
		{
			int compare=input1.compareTo(input2);
			if(compare<0)
			{
				largerName=input2;
				smallerName=input1;
			}
			else
			{
				largerName=input1;
				smallerName=input2;
			}
		}
		
		String userId=smallerName.charAt(smallerName.length()-1)+largerName+pin.charAt(input4-1)+pin.charAt(pin.length()-input4);
		StringBuffer sb=new StringBuffer(userId);


		for(int i=0;i<userId.length();i++)
		{
			if(Character.isLowerCase(userId.charAt(i)))
			{
				sb.setCharAt(i, Character.toUpperCase(userId.charAt(i)));
			}
			else
			{
				sb.setCharAt(i, Character.toLowerCase(userId.charAt(i)));
			}
		}
		return sb.toString();
	}
    public static void main(String[] args) {

		System.out.println(userIdGeneration("Rajiv", "Roy", 560037, 6));
    }
}
