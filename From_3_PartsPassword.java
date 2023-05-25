public class From_3_PartsPassword {
    public static int from3Partsassword(int []input1,int input2)
    {
        String output="";
        int part1=findMaxFrequency(input1);
        for(int i=0;i<input1.length;i++)
        {
            if(input1[i]==part1)
            {
                input1[i]=0;
            }
        }
        int part2=findMaxFrequency(input1);
        int part3=findMinFrequency(input1);
        output+=part1;
        output+=part2;
        output+=part3;

        return Integer.parseInt(output);

    }
    public static int findMaxFrequency(int []input)
    {
        //12 2 36 10 217 36 5 36 15 10
        int []array=new int[251];
        for(int i=0;i<input.length;i++)
        {
            if(input[i]>0)
            {
                array[input[i]]++;
            }
        }
        int maxFreq=0,max=0;
        for(int i=0;i<array.length;i++)
        {
            if(array[i]>0)
            {
                if(max<=array[i])
                {
                    max=array[i];
                    maxFreq=i;
                }
            }
        }
        return maxFreq;
    }

    public static int findMinFrequency(int []input)
    {
        //12 2 36 10 217 36 5 36 15 10
        int []array=new int[251];
        for(int i=0;i<input.length;i++)
        {
            if(input[i]>0)
            {
                array[input[i]]++;
            }
        }
        int minFreq=0,min=9;
        for(int i=0;i<array.length;i++)
        {
            if(array[i]>0)
            {
                if(min>array[i])
                {
                    min=array[i];
                    minFreq=i;
                }
            }
        }
        return minFreq;
    }


    public static void main(String[] args) {
        int input1[]={12, 2, 36, 10, 217, 36, 5, 36, 15, 10};
        int input2=input1.length;
        System.out.println(from3Partsassword(input1,input2));
    }
}
