import java.io.*;
import  java.util.*;


// Read only region start
public class MostFrequentlyOccurringDigit
{
    //https://tests.mettl.com/v2/authenticateKey/cbe4c4da
    
	public static int mostFrequentlyOccurringDigit(int[] input1,int input2){
		// Read only region end
		// Write code here...
        int num[]={0,0,0,0,0,0,0,0,0,0};
        for(int i=0;i<input2;i++)
        {
            while (input1[i]>0) {
             
                int rem=input1[i]%10;
                num[rem]++;
                input1[i]=input1[i]/10;
            }
        }
        int max=0;
        ArrayList<Integer>highestOccur=new ArrayList<>();
        for(int i=0;i<num.length;i++)
        {
            if(num[i]>max)
            {
                max=num[i];
                highestOccur.add(i);
            }
        }
        return Collections.max(highestOccur);

	}
    public static void main(String[] args) {
        int arr[]={1237, 20, 666, 140};
        System.out.println(mostFrequentlyOccurringDigit(arr, arr.length));
    }
}