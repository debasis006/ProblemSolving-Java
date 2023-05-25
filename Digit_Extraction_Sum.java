import java.util.Scanner;

public class Digit_Extraction_Sum {

    public int digit_Extraction_Sum(String input1) {
        int sum = 0;
        while (input1.length() == 0) {
            for (int i = 0; i < input1.length(); i++) {
                if (Character.isDigit(input1.charAt(i))) {
                    sum = sum + Integer.parseInt(String.valueOf(input1.charAt(i)));
                }
            }
            input1=Integer.toString(sum);
        }
        return Integer.parseInt(input1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    }
}