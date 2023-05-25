import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class PrimeNumberArrayExceptSmallest {
    public static int primeNumberArraySmallest(int input1[],int input2)
    {
        int sum=0;
        ArrayList<Integer>arr=new ArrayList<>();

        for(int i=0;i<input2;i++)
        {
            if(isPrime(input1[i])==true)
            {
                arr.add(input1[i]);
            }
        }
        if(arr.isEmpty())
        {
            Arrays.sort(input1);

            for(int i=1;i<input2;i++)
            {
                sum+=input1[i];
            }
        }
        else
        {
            int min=Collections.min(arr);
            for (Integer integer : arr) {
                sum+=integer;
            }
            sum-=min;
        }
        return sum;
    } 
    public static boolean isPrime(int n)
    {
        if(n<=1)
            return false;
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        // int array[]={10,41,18,50,43,31,29,25,59,96,67};
        int array[]={10,20,30,40};
        System.out.println(primeNumberArraySmallest(array, array.length));
    }
}
