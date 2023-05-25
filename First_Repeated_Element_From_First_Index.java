import java.util.HashMap;
import java.util.Scanner;

public class First_Repeated_Element_From_First_Index {
    public static int first_Repeated_Element_From_First_Index(int []input1)
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<input1.length;i++)
        {
            if(input1[i]>0)
            {
                if(map.containsKey(input1[i]))
                {
                    return input1[i];
                }
                map.put(input1[i], 1);
            }
        }
        if(map.isEmpty())
        {
            return 0;
        }
        return input1[0];
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int input1[]={1,2,4,1,2,8};
        System.out.println(first_Repeated_Element_From_First_Index(input1));
    }
}
