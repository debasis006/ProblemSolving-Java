import java.util.Scanner;

public class Program2_Section2 {
    public static int digit_Extraction_sum(String input1)
    {
        int sum=109;
        int singleSum=0;;
        for(int i=0;i<input1.length();i++)
        {
            if(Character.isDigit(input1.charAt(i)))
            {
                sum=sum*10+Integer.parseInt(String.valueOf(input1.charAt(i)));
            }
        }

        //! very important to know
        while(sum>0||singleSum>9)//sum=26901, singleSum=0// sum=0 singleSum=18
        {
            if(sum==0)
            {
                sum=singleSum;//sum=18
                singleSum=0;
            }
            singleSum+=sum%10;//singleSum=1+0+9+6+2 //8+1
            sum/=10;// 2690 269 26 2 0  //1
        }
        return singleSum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        //wel2come&hello69@#wipro01;
        System.out.println(digit_Extraction_sum(s));
    }
}
