import java.io.*;
import  java.util.*;

// Read only region start
public class subString
{

	public static String secondWordUpperCase(String input1){
		// Read only region end
		// Write code here...
		String sub[]=input1.split(" ");
        if(sub.length==1)
            return "LESS";
        else
            return sub[1].toUpperCase();
	}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(secondWordUpperCase(s));
    }
}