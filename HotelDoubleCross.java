//! Hotel Double Cross 

import java.util.Scanner;

public class HotelDoubleCross {
    public static int hotelDoubleCross(int input1[],int input2[],int input3[],int size)
    {
        int array[]=new int[size];
        for(int i=0;i<array.length;i++)
        {
            array[i]=(input1[i]+input2[i]+input3[i]);
        }
        int sum=0;
        for(int i=0;i<size;i+=3){
            int n1=0,n2=0,n3=0;
            if(i<size){
                n1=getNumber(array[i], input1, size);
            }

            if((i+1)<size){
                n2=getNumber(array[i+1], input2, size);
            }

            if((i+2)<size){
                n3=getNumber(array[i+2], input3, size);
            }

            sum+=(n1+n2+n3);
        }

        return sum;
    }
    public static int getNumber(int value,int input[],int n){
        int rem=(value%n)-1;
        if(rem<0){
            return input[n-1];
        }
        return input[rem];
    }

    public static int [] arrayReturn(String s)
    {
        String str[]=s.split(",");
        int array[]=new int[str.length];
        for(int i=0;i<str.length;i++)
        {
            array[i]=Integer.parseInt(str[i]);
        }
        return array;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=0;

        String s1=sc.nextLine();
        int input1[]=arrayReturn(s1);
        size=input1.length;

        String s2=sc.nextLine();
        int input2[]=arrayReturn(s2);
        size=input2.length;

        String s3=sc.nextLine();
        int input3[]=arrayReturn(s3);
        size=input3.length;

        System.out.println(HotelDoubleCross(input1,input2,input3,size));
        sc.close();

    }
}
