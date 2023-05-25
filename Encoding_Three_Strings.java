// ! Encoding  Three String


import java.util.Scanner;

class EncodingThreeStrings {
    public class Result {
        public final String output1;
        public final String output2;
        public final String output3;

        public Result(String out1, String out2, String out3) {
            output1 = out1;
            output2 = out2;
            output3 = out3;
        }
    }

    public Result encodeThreeStrings_Model_1_(String input1, String input2, String input3) {

        /*
         * Input 1: “John”
         * Input 2: “Johny”
         * Input 3: “Janardhan”
         */
        /*
         * Output1 = “JJoJan”
         * Output2= “ohhard’
         * Output3 = “NNYHAN”
         */

        String[][] res = new String[3][3];
        String[] words = { input1, input2, input3 };
        for (int i = 0; i < 3; i++) {
            int l = words[i].length();
            if (l % 3 == 0 || l % 3 == 1) {

                res[i][0] = words[i].substring(0, l / 3);
                res[i][1] = words[i].substring(l / 3, l - l / 3);
                res[i][2] = words[i].substring(l - l / 3);
            } else {
                res[i][0] = words[i].substring(0, l / 3 + 1);
                res[i][1] = words[i].substring(l / 3 + 1, l - l / 3 - 1);
                res[i][2] = words[i].substring(l - l / 3 - 1);
            }
        }
        // Output1: FRONT part of input 1 + FRONT part of input 2 + FRONT part of input
        // 3
        String output1 = res[0][0] + res[1][0] + res[2][0];
        // Output2: MIDDLE part of input1 + MIDDLE part of input2 + MIDDLE part of
        // input3
        String output2 = res[0][1] + res[1][1] + res[2][1];
        // Output3: END part of the input1 + END part of input2 + END part of input3
        String output3 = res[0][2] + res[1][2] + res[2][2];
        String temp = output3;
        output3 = "";
        for (int i = 0; i < temp.length(); i++) {
            if (Character.isUpperCase(temp.charAt(i)))
                output3 = output3 + Character.toLowerCase(temp.charAt(i));
            else
                output3 = output3 + Character.toUpperCase(temp.charAt(i));

        }
        return new Result(output1, output2, output3);
    }

    public Result encodeThreeStrings_Model_2_(String input1, String input2, String input3) {

        /*
         * Input 1: “John”
         * Input 2: “Johny”
         * Input 3: “Janardhan”
         */
        /*
         * Output1 = “Jnhan”
         * Output2= “ohnyJan’
         * Output3 = “NjOARD”
         */

        String[][] res = new String[3][3];
        String[] words = { input1, input2, input3 };
        for (int i = 0; i < 3; i++) {
            int l = words[i].length();
            if (l % 3 == 0 || l % 3 == 1) {

                res[i][0] = words[i].substring(0, l / 3);
                res[i][1] = words[i].substring(l / 3, l - l / 3);
                res[i][2] = words[i].substring(l - l / 3);
            } else {
                res[i][0] = words[i].substring(0, l / 3 + 1);
                res[i][1] = words[i].substring(l / 3 + 1, l - l / 3 - 1);
                res[i][2] = words[i].substring(l - l / 3 - 1);
            }
        }
        // Output1: FRONT part of input 1 + MIDDLE part of input 2 + END part of input 3
        String output1 = res[0][0] + res[1][1] + res[2][2];
        // Output2: MIDDLE part of input1 + END part of input2 + FRONT part of input3
        String output2 = res[0][1] + res[1][2] + res[2][0];
        // Output3: END part of the input1 + FRONT part of input2 + MIDDLE part of
        // input3
        String output3 = res[0][2] + res[1][0] + res[2][1];
        String temp = output3;
        output3 = "";
        for (int i = 0; i < temp.length(); i++) {
            if (Character.isUpperCase(temp.charAt(i)))
                output3 = output3 + Character.toLowerCase(temp.charAt(i));
            else
                output3 = output3 + Character.toUpperCase(temp.charAt(i));

        }
        return new Result(output1, output2, output3);
    }

    public Result encodeThreeStrings_Model_3_(String input1, String input2, String input3) {

        /*
         * Input 1: “John”
         * Input 2: “Johny”
         * Input 3: “Janardhan”
         */
        /*
         * Output1 = “Jnyard”
         * Output2= “ohJohan’
         * Output3 = “NHjAN”
         */

        String[][] res = new String[3][3];
        String[] words = { input1, input2, input3 };
        for (int i = 0; i < 3; i++) {
            int l = words[i].length();
            if (l % 3 == 0 || l % 3 == 1) {

                res[i][0] = words[i].substring(0, l / 3);
                res[i][1] = words[i].substring(l / 3, l - l / 3);
                res[i][2] = words[i].substring(l - l / 3);
            } else {
                res[i][0] = words[i].substring(0, l / 3 + 1);
                res[i][1] = words[i].substring(l / 3 + 1, l - l / 3 - 1);
                res[i][2] = words[i].substring(l - l / 3 - 1);
            }
        }
        // Output1: FRONT part of input 1 + END part of input 2 + MIDDLE part of input 3
        String output1 = res[0][0] + res[1][2] + res[2][1];
        // Output2: MIDDLE part of input1 + FRONT part of input2 + END part of input3
        String output2 = res[0][1] + res[1][0] + res[2][2];
        // Output3: END part of the input1 + MIDDLE part of input2 + FRONT part of
        // input3
        String output3 = res[0][2] + res[1][1] + res[2][0];
        String temp = output3;
        output3 = "";
        for (int i = 0; i < temp.length(); i++) {
            if (Character.isUpperCase(temp.charAt(i)))
                output3 = output3 + Character.toLowerCase(temp.charAt(i));
            else
                output3 = output3 + Character.toUpperCase(temp.charAt(i));

        }
        return new Result(output1, output2, output3);
    }

    public Result encodeThreeStrings_Model_4_(String input1, String input2, String input3) {

        /*
         * Input 1: “John”
         * Input 2: “Johny”
         * Input 3: “Janardhan”
         */
        /*
         * Output1 = “Johnhan”
         * Output2= “ohyJan’
         * Output3 = “NjARD”
         */

        String[][] res = new String[3][3];
        String[] words = { input1, input2, input3 };
        for (int i = 0; i < 3; i++) {
            int l = words[i].length();
            res[i][0] = words[i].substring(0, l / 3);
            res[i][1] = words[i].substring(l / 3, l - l / 3);
            res[i][2] = words[i].substring(l - l / 3);
        }
        // Output1: FRONT part of input 1 + MIDDLE part of input 2 + END part of input 3
        String output1 = res[0][0] + res[1][1] + res[2][2];
        // Output2: MIDDLE part of input1 + END part of input2 + FRONT part of input3
        String output2 = res[0][1] + res[1][2] + res[2][0];
        // Output3: END part of the input1 + FRONT part of input2 + MIDDLE part of
        // input3
        String output3 = res[0][2] + res[1][0] + res[2][1];
        String temp = output3;
        output3 = "";
        for (int i = 0; i < temp.length(); i++) {
            if (Character.isUpperCase(temp.charAt(i)))
                output3 = output3 + Character.toLowerCase(temp.charAt(i));
            else
                output3 = output3 + Character.toUpperCase(temp.charAt(i));

        }
        return new Result(output1, output2, output3);
    }

}

public class Encoding_Three_Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input1 = sc.nextLine();
        String input2 = sc.nextLine();
        String input3 = sc.nextLine();
        // UserMainCode um = new UserMainCode();
        EncodingThreeStrings ens = new EncodingThreeStrings();

        //! For type-->1

        System.out.println("OutPut1 : " + ens.encodeThreeStrings_Model_1_(input1, input2, input3).output1);
        System.out.println("OutPut2 : " + ens.encodeThreeStrings_Model_1_(input1, input2, input3).output2);
        System.out.println("OutPut3 : " + ens.encodeThreeStrings_Model_1_(input1, input2, input3).output3);


        //! For type-->2
        
        // System.out.println("OutPut1 : " + ens.encodeThreeStrings_Model_2_(input1, input2, input3).output1);
        // System.out.println("OutPut2 : " + ens.encodeThreeStrings_Model_2_(input1, input2, input3).output2);
        // System.out.println("OutPut3 : " + ens.encodeThreeStrings_Model_2_(input1, input2, input3).output3);


        //! For type-->3
        
        // System.out.println("OutPut1 : " + ens.encodeThreeStrings_Model_3_(input1, input2, input3).output1);
        // System.out.println("OutPut2 : " + ens.encodeThreeStrings_Model_3_(input1, input2, input3).output2);
        // System.out.println("OutPut3 : " + ens.encodeThreeStrings_Model_3_(input1, input2, input3).output3);


        //! For type-->4
        
        // System.out.println("OutPut1 : " + ens.encodeThreeStrings_Model_4_(input1, input2, input3).output1);
        // System.out.println("OutPut2 : " + ens.encodeThreeStrings_Model_4_(input1, input2, input3).output2);
        // System.out.println("OutPut3 : " + ens.encodeThreeStrings_Model_4_(input1, input2, input3).output3);


    }
}
