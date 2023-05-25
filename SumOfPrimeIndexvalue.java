import java.util.ArrayList;

public class SumOfPrimeIndexvalue {
    public static int sumOfPrimeIndexvalues(int []input1,int input2)
    {
        int sum=0;
        ArrayList<Integer>arr=new ArrayList<>();
        for(int i=0;i<input2;i++)
        {
            if(isPrime(i)==true)
            {
                arr.add(input1[i]);
            }
        }
        for( int i=0;i<arr.size();i++)
        {
            sum+=arr.get(i);
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
        // int array[]={10,20,30,40,50,60,70,80,90,100};
        // int array[]={-4,5};
        int array[]={-1,-2,-3,3,4,-7};
        System.out.println(sumOfPrimeIndexvalues(array, array.length));

    }
}
