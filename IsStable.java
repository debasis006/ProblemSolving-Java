import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class IsStable{
    static boolean isStable(int num){
        int arr[]=new int[10];
        int p=-1;
        while(num>0){
            int r=num%10;
            arr[r]++;
            num/=10;
        }

        for(int i=0;i<10;i++){
            if(arr[i]!=0 && p==-1){
                p=arr[i];
            }

            else if(arr[i]!=0 && p!=arr[i]){
                return false;
            }
        }

        return true;

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer>unstable=new ArrayList<>();
        ArrayList<Integer>stable=new ArrayList<>();

        int input1=sc.nextInt();
        int input2=sc.nextInt();
        int input3=sc.nextInt();
        int input4=sc.nextInt();
        int input5=sc.nextInt();
        list.add(input1);
        list.add(input2);
        list.add(input3);
        list.add(input4);
        list.add(input5);

        for(int i=0;i<list.size();i++)
        {
            if(isStable(list.get(i))==true)
            {
                stable.add(i);
            }
            else
            {
                unstable.add(i);
            }
        }
        int maximum=Collections.max(unstable);
        int minimum=Collections.min(unstable);

        int output=maximum+minimum;
        return output;
    }

}