import java.util.ArrayList;

public class Find_String_Weight_AND {
    public static int find_String_Weight_AND(int input1[],String input2)
    {
        ArrayList<Integer>list=new ArrayList<>();
        ArrayList<Integer>pos=new ArrayList<>();
        ArrayList<Integer>output=new ArrayList<>();
        String string[]=input2.toLowerCase().split(" ");
        int answer=1;

        for(int i=0;i<string.length;i++){
            int sum=0;
            for(int j=0;j<string[i].length();j++){
                int position = string[i].charAt(j) - 'a' + 1;
                list.add(input1[position-1]);
                pos.add(position);
            }
            
            for(int k=0;k<list.size();k++){
                if(list.get(k)>=0){
//                  System.out.print("(For +ve:)"+list.get(k)+" ");
                    sum=sum+list.get(k);
                }
                
                else if(list.get(k) < 0 && k != 0 && k != list.size()-1 ){
//                    System.out.print("(For -ve mid:)"+list.get(k)+" ");
                    sum=sum+list.get(k);
                }
                
                else {
//                	 System.out.print("(");
//                   System.out.print("(For edge:)"+list.get(k)+" + ");
//                   System.out.print(pos.get(k)+" ");
//                   System.out.print(")");
                     sum=sum+list.get(k)+pos.get(k);
                }               
            }
//          System.out.println();
//          System.out.println(list);
//          System.out.println();
            
//          System.out.println(sum);
            output.add(sum);
            list.clear();
            pos.clear();
        }
        for (Integer integer:output) 
            answer=answer*integer;
        return answer;
    } // find_String_Weight_AND

    public static void main(String[] args) {

        //! testcase--1
        int input1[]={15,16,1,-2,-13,61,11,4,3,19,-4,17,-3,90,-65,67,12,0,13,2,3,43,21,-17,2,42};
        String input2="Wipro Limited";

        //! testcase--2
        // int input1[]={12,11,6,1,-1,23,12,1,28,-43,6,98,11,2,7,88,9,-4,-54,25,19,-12,-32,65,3,-9};
        //  String input2="Spring AND Hibernate";

        System.out.println(find_String_Weight_AND(input1,input2));
    }
}