public class First_And_Last_Vowel_Character_Strings{
    static String first_And_Last_Vowel_Character_Strings(int input1,String[] input2){
        String str="";
        for(int i=0;i<input1;i++){
            String ele=input2[i];
            if(isVowel(ele.charAt(0)) && isVowel(ele.charAt(ele.length()-1))){
                str=str+input2[i];
            }
            
        }
        if(str=="")
            return "no matches found";
        else
            return str.toLowerCase();

    }
    static boolean isVowel(char c)
    {
        if(c=='a' || c=='A' || c=='e' || c=='E' || c=='i' || c=='I' || c=='o' || c=='O' ||     c=='u' || c=='U')
        {    
            return true;
        }    
        else
        {
            return false;
        }    
    }


    public static void main(String[] args) {

        // ! Testcase--1
        // int input1=3;
        // String[] input2={"oreo","sirish","apple"};

        // ! Testcase--2
        // int input1=2;
        // String[] input2={"Mango","banana"};

        // ! Testcase--3
        int input1=4;
        String[] input2={"oreo","sirish","Apple","ugAnda"};
        System.out.println(first_And_Last_Vowel_Character_Strings(input1, input2));
    }
}