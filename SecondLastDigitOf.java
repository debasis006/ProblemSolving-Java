import java.io.*;
import  java.util.*;

// Read only region start
public class SecondLastDigitOf
{

	public int secondLastDigitOf(int input1){
		// Read only region end
		// Write code here...
		ArrayList<Integer>arr=new ArrayList<>();
		int num=Math.abs(input1);
		int c=0;
		if(num==5)
			return -1;
		else if(String.valueOf(num).length()==1)
			return -1;
		else
		{
			while(num>0)
			{
				c=c+1;
				arr.add(num%10);
				num=num/10;
			}
			return arr.get(1);
		}
	}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        QS5 qs=new QS5();
        System.out.println(qs.secondLastDigitOf(n));
    }
}