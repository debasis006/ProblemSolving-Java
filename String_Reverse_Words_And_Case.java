// ! String_Reverse_Words_And_Case

import java.util.ArrayList;
import java.util.Scanner;

public class String_Reverse_Words_And_Case {

    // Wipro TechNologies BangaLore

    public static String string_Reverse_Words_And_Case(String input1, int input2) {
        ArrayList<Integer> list = new ArrayList<>();
        String output = "";
        String input[] = input1.split(" ");
        if (input2 == 0) {
            for (int i = 0; i < input.length; i++) {
                String reverse = new StringBuilder(input[i]).reverse().toString();
                output += reverse;
                if (i + 1 < input1.length()) {
                    output += " ";
                }
            }
            return output;
        } else {
            for (int i = 0; i < input1.length(); i++) {
                if (Character.isUpperCase(input1.charAt(i))) {
                    list.add(i + 1);
                }
            }
            // for (Integer integer : list) {
            // System.out.print(integer+" ");
            // }
            for (int i = 0; i < input.length; i++) {
                String reverse = new StringBuilder(input[i]).reverse().toString().toLowerCase();
                output += reverse;
                if (i + 1 < input1.length()) {
                    output += " ";
                }
            }
            // for using setCharAt method
            StringBuffer str = new StringBuffer(output);

            for (int i = 0; i < list.size(); i++) {
                for (int j = 0; j < output.length(); j++) {
                    // System.out.println(list.get(i));
                    if ((list.get(i) - 1) == j) {
                        str.setCharAt(j, Character.toUpperCase(output.charAt(j)));
                    }
                }
            }
            return str.toString();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input1 = sc.nextLine();
        int input2 = sc.nextInt();
        System.out.println(string_Reverse_Words_And_Case(input1, input2));
        // reverseWordsAndCase(input1, input2);

    }
}
