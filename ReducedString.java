import java.io.*;
import java.util.*;

public class ReducedString {

    // Date- 03/06/22
    // https://tests.mettl.com/v2/authenticateKey/1tkfnuxhc0

    public static String reducedString(String input1) {
        // Read only region end
        // Write code here...
        
        String str="";
        if(input1.length()%2==0)
        {
            str=str+input1.charAt(0);
            for(int i=0;i<input1.length();i++)
            {
                if(i%2!=0)
                    continue;
                else
                    str=str+input1.charAt(i);
            }
        }
        else if(input1.length()%2==1)
        {
            for(int i=0;i<input1.length();i++)
            {
                if(i%2==1)
                    continue;
                str+=input1.charAt(i);
            }
        }

        return str;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(reducedString(s));
    }
}
