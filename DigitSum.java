import java.io.*;
import  java.util.*;

// Read only region start
public class DigitSum
{

	public static int digitSum(int input1){
		// Read only region end
		// Write code here...
        int sum=0;
		while(Integer.toString(input1).length()>1)
        {
            sum+=input1%10;
            input1=input1/10;
        }
        return digitSum(sum);
	}
    public static void main(String[] args) {
        int n=1234;
        System.out.println(digitSum(n));
    }
}