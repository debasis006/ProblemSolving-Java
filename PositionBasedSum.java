//! Position Based Sum

import java.util.ArrayList;
import java.util.Scanner;

public class PositionBasedSum {
    static int positionBasedSum1(int arr[]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            int l=(int)(Math.floor(Math.log10(arr[i]))+1);
            if(l>=(i+1)){
                int n=arr[i]%(int)Math.pow(10,(i+1));
                n=n/(int)Math.pow(10,i);

                sum+=(n*n);
            }
        }

        return sum;
    }
    public static int positionBasedSum(int input1[],int input2)
    {
        int sum=0;
        ArrayList<Integer>list=new ArrayList<>();
        ArrayList<Integer>squareList=new ArrayList<>();
        for(int i=0;i<input2;i++)
        {
            if(input1[i]>i)
            {
                list.add(firstDigit(input1[i]));
            }
            else
            {
                list.add(0);
            }
        }

        for(int i=0;i<list.size();i++)
        {
            int square=(int)Math.pow(list.get(i), 2);
            squareList.add(square);
        }
        
        for (Integer integer : squareList) {
            sum+=integer;
        }
        
        return sum;

    }
    public static int firstDigit(int input)
    {
        while (input>=10) {
            input/=10;
        }
        return input;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int input1[]=new int[]{1,51,436,7860,41236};
        // int input1[]=new int[]{1,5,423,310,61540};
        int input2=input1.length;

        System.out.println(positionBasedSum(input1, input2)); 

    }
}
