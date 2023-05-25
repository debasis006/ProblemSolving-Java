//! 00000000000000000
import java.util.Scanner;

public class The_String_Decoder_0000 {
    public static String the_String_Decoder_0000(String input1)
    {
        StringBuffer sb=new StringBuffer();
        int count=0;
        for(int i=0;i<input1.length();i++)
        {
            char ch=input1.charAt(i);
            if(ch=='1')
            {
                sb.append((char)('Z'-(count-1)));
                count=0;
            }
            else if(ch=='0')
            {
                count++;
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input1=sc.nextLine();
        System.out.println(the_String_Decoder_0000(input1));
    }
}
