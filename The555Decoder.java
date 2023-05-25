//! The 555 Decoder


import java.util.Scanner;

public class The555Decoder {
    public static int decoder(int []input1,int input2)
    {
        int ans=0;
        for(int i=0;i<input1.length;i++)
        {
            if(input1[i]>99&&input1[i]<999)
            {
                input1[i]=subFive(input1[i]);
                input1[i]=digitSum(input1[i]);
                ans+=input1[i];
            }
            else
            {
                input1[i]=0;
            }
        }
        return ans;
    }
    public static int subFive(int input)
    {
        StringBuffer sb=new StringBuffer();
        while (input>0) {
            int rem=input%10;
            sb.append(Math.abs(rem-5));
            input/=10;
        }
        sb.reverse();
        String s=sb.toString();
        return Integer.parseInt(s);
    }
    public static int digitSum(int input)
    {
        int sum=0;
        while (input>0) {
            sum=0;
            while (input>0) {
                int rem=input%10;
                sum+=rem;
                input/=10;
            }
            if(sum>9)
                input=sum;
        }
        return sum; 
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int input[]=new int[]{179,281,379,218,610};
        int size=input.length;
        System.out.println(decoder(input,size));
        sc.close();
    }
}
