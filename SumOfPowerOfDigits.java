import java.util.Scanner;

public class SumOfPowerOfDigits {

    //https://tests.mettl.com/v2/authenticateKey/92437794
    public static int sumOfPowerOfDigits(int n) {
        String s = Integer.toString(n);
        char ch[] = s.toCharArray();
        int i = 0, j = 1;
        int sum = 0;
        while (i < ch.length && j < ch.length) {
            int n1 = Integer.parseInt(String.valueOf(ch[i]));
            int n2 = Integer.parseInt(String.valueOf(ch[j]));
            System.out.println((int) Math.pow(n1, n2));
            sum = sum + (int) Math.pow(n1, n2);
            i++;
            j++;
        }
        if(j == ch.length - 1)
        {
            int n2 = Integer.parseInt(String.valueOf(ch[j]));
            sum = sum + (int) Math.pow(n2, 0);
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println();
        System.out.println("Ans"+sumOfPowerOfDigits(n));

    }
}