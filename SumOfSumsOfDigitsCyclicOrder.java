import java.util.Scanner;

public class SumOfSumsOfDigitsCyclicOrder{
    public static int sumOfSumsOfDigitsCyclicOrder(int input){
            String s=Integer.toString(input);
            char ch[]=s.toCharArray();
            int sum=0;
            for(int i=0;i<ch.length;i++)
            {
                for(int j=i;j<ch.length;j++)
                {
                    int val=Integer.parseInt(String.valueOf(ch[j]));
                    sum=sum+val;
                }
            }  
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(sumOfSumsOfDigitsCyclicOrder(n));
    }
}