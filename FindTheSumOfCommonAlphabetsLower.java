import java.util.HashSet;
import java.util.Set;

public class FindTheSumOfCommonAlphabetsLower {
    public static int findTheSumOfCommonAlphabetsLower(char input1[], char input2[]) {
        int sum = 0;
        Set<Integer> list = new HashSet<>();
        for (int i = 0; i < input1.length; i++) {
            for (int j = 0; j < input2.length; j++) {
                if (input1[i] == input2[j]) {
                    list.add((int) input1[i]);
                    break;
                }

            }
        }
        for (Integer integer : list) {
            sum += integer;
        }
        return singleDigitSum(sum);
    }

    public static int singleDigitSum(int input) {
        int sum = 0;
        while (input > 0 || sum > 9) {
            if (input == 0) {
                input = sum;
                sum = 0;
            }
            sum += input % 10;
            input /= 10;
        }
        return sum;
        // if(input==0)
        // return 0;
        // return (input%9==0)?9:(input%9);
    }

    public static void main(String[] args) {
        // char input1[] = { 'a', 'b', 'c' };
        // char input2[] = { 'b', 'c' };

        char input1[] = { 'g', 'q', 'r' };
        char input2[] = { 'r', 't', 'u' };

        System.out.println(findTheSumOfCommonAlphabetsLower(input1, input2));
    }
}
