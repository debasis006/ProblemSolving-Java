import java.util.Scanner;

public class Indexfind{
    public static int indexfind(int n)
    {
        if(n<=1)
            return n+1;
        int a=0,b=1,c=1;
        int index=2;
        while (c<n) {//1<2
            c=a+b;
            a=b;
            b=c;
            index++;
        }
        return index;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(indexfind(n));
    }
}