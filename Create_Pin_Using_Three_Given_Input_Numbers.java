import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Create_Pin_Using_Three_Given_Input_Numbers {

    public static String create_Pin_Using_Three_Given_Input_Numbers(int input1,int input2,int input3)
    {
        String output="";
        ArrayList<Integer>inputs=new ArrayList<>();
        ArrayList<Integer>smallest=new ArrayList<>();
        ArrayList<Integer>largest=new ArrayList<>();
        inputs.add(input1);
        inputs.add(input2);
        inputs.add(input3);

        for(int i=0;i<inputs.size();i++)
        {
            int small=smallestValue(inputs.get(i));
            smallest.add(small);
        }
        Collections.sort(smallest);

        for(int i=0;i<inputs.size();i++)
        {
            int large=largestestValue(inputs.get(i));
            largest.add(large);
        }
        Collections.sort(largest);

        int thousandDigit=smallest.get(0);
        int hundradDigit=largest.get(largest.size()-1);
        int tenDigit=lowFreq(inputs);
        int oneDigit=highestFreq(inputs);

        output=String.valueOf(thousandDigit)+String.valueOf(hundradDigit)+String.valueOf(tenDigit)+Integer.valueOf(oneDigit);
        return output;
    }


    public static int smallestValue(int input)
    {
        ArrayList<Integer>smallDigit=new ArrayList<>();
        while (input>0) {
            int num=input%10;
            smallDigit.add(num);
            input=input/10;
        }
        Collections.sort(smallDigit);
        return smallDigit.get(0);
    }


    public static int largestestValue(int input)
    {
        ArrayList<Integer>largestDigit=new ArrayList<>();
        while (input>0) {
            int num=input%10;
            largestDigit.add(num);
            input=input/10;
        }
        Collections.sort(largestDigit);
        Collections.reverse(largestDigit);;
        return largestDigit.get(0);
    }

    public static int lowFreq(ArrayList<Integer>inputs)
    {
        ArrayList<Integer>list=new ArrayList<>();
        int []digitArray={0,0,0,0,0,0,0,0,0,0};
        for(int i=0;i<inputs.size();i++)
        {
            int num=inputs.get(i);
            while (num>0) {
                int rem=num%10;
                digitArray[rem]++;
                num=num/10;
            }
        }
        for(int i=0;i<digitArray.length;i++)
        {
            if(digitArray[i]==1)
            {
                list.add(i);
            }
        }
        return list.get(0);
    }

    public static int highestFreq(ArrayList<Integer>inputs)
    {
        ArrayList<Integer>list=new ArrayList<>();
        int []digitArray={0,0,0,0,0,0,0,0,0,0};
        for(int i=0;i<inputs.size();i++)
        {
            int num=inputs.get(i);
            while (num>0) {
                int rem=num%10;
                digitArray[rem]++;
                num=num/10;
            }
        }
        for(int i=0;i<digitArray.length;i++)
        {
            if(digitArray[i]==maxElement(digitArray))
            {
                list.add(i);
            }
        }
        return list.get(list.size()-1);
    }

    public static int maxElement(int array[])
    {
        int max=array[0];
        for(int i=0;i<array.length;i++)
        {
            if(array[i]>max)
            {
                max=array[i];
            }
        }
        return max;
    }

    public static int minElement(int array[])
    {
        int min=1;
        for(int i=0;i<array.length;i++)
        {
            if(array[i]<min)
            {
                min=array[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // int input1=1274;
        // int input2=5283;
        // int input3=1937;

        int input1=8530;
        int input2=5620;
        int input3=7532;
        
       System.out.println(create_Pin_Using_Three_Given_Input_Numbers(input1,input2,input3));
    }
}
