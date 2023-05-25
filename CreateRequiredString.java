import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CreateRequiredString{
    public static String createRequiredString(int input1)
    {
        
        List<String>list=new ArrayList<>();
        String str="";
        if(input1>=0)
        {
            String s=Integer.toString(input1);
            list.add("p");
            for(int i=0;i<s.length();i++)
            {
                if(Integer.parseInt(String.valueOf(s.charAt(i)))%2==0&&Integer.parseInt(String.valueOf(s.charAt(i)))!=0)
                {
                    list.add("e");
                }
                else if(Integer.parseInt(String.valueOf(s.charAt(i)))%2!=0)
                {
                    list.add("o");
                }
                else if(Integer.parseInt(String.valueOf(s.charAt(i)))==0)
                {
                    list.add("z");
                }
            }
        }
        else if(input1<0)
        {
            String s=Integer.toString(Math.abs(input1));
            list.add("n");
            for(int i=0;i<s.length();i++)
            {
                if(Integer.parseInt(String.valueOf(s.charAt(i)))%2==0)
                {
                    list.add("e");
                }
                else if(Integer.parseInt(String.valueOf(s.charAt(i)))%2!=0)
                {
                    list.add("o");
                }
                else if(Integer.parseInt(String.valueOf(s.charAt(i)))==0)
                {
                    list.add("z");
                }
            }
        }
        for(String l:list)
        {
            str+=l;
        }
        return str;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int input1=sc.nextInt();
        System.out.println(createRequiredString(input1));
    }
}