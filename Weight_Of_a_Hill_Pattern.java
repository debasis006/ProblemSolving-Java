import java.util.Scanner;

public class Weight_Of_a_Hill_Pattern {

    public static int weight_Of_a_Hill_Pattern(int input1,int input2, int input3 ){
        int sum=input2;
        for(int i=1;i<input1;i++){
            sum=sum+(i*input2)+((i+1)*(input2+input3));
            input2+=input3;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input1 = sc.nextInt();
        int input2 = sc.nextInt();
        int input3 = sc.nextInt();
        System.out.println(weight_Of_a_Hill_Pattern(input1, input2, input3));
    }
}
