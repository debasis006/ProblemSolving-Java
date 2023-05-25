import java.util.HashMap;
import java.util.Map;

public class From_2_PartPassword {
    public static int from2partPassword(int[] input1, int input2){
        Map<Integer, Integer> map = new HashMap<>();
        int n= input2;
        
        for(int c : input1){
            if(map.containsKey(c)){
                map.put(c, map.get(c)+1);
            }
            else{
                map.put(c, 1);
            }
        }
        
        int maxfreq= -1, maxele= -1;
        
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            
            if(entry.getValue()>maxfreq){
                maxfreq= entry.getValue();
                maxele= entry.getKey();
            }
            else if(entry.getValue()==maxfreq){
                if(entry.getKey()>maxele){
                    maxele= entry.getKey();
                }
            }
        }
        
        int secmaxfreq= -1, secmaxele= -1;
        
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            
            if(entry.getValue()>secmaxfreq && entry.getValue()!=maxfreq){
                secmaxfreq= entry.getValue();
                secmaxele= entry.getKey();
            }
            else if(entry.getValue()==secmaxfreq && entry.getValue()!=maxfreq){
                if(entry.getKey()>secmaxele){
                    secmaxele= entry.getKey();
                }
            }
        }
        
        String str1 = Integer.toString(secmaxele);
        String str2 = Integer.toString(maxele);
        String ansstr= str1+str2;
        
        int ans=Integer.parseInt(ansstr);
        
        return ans;
    }


    // ! Debanjan
    static int generatePin(int arr[]){
        HashMap<Integer,Integer> map=new HashMap<>();
        int h=0,sc=0;
        for(int n:arr){
            map.put(n,map.getOrDefault(n, 0)+1);
            if(map.get(n)>h){
                sc=h;
                h=map.get(n);
            }
        }

        int hNum=0,scNum=0;
        for(int k:map.keySet()){
            if(map.get(k)==h){
                hNum=k>hNum?k:hNum;
            }

            if(map.get(k)==sc){
                scNum=k>scNum?k:scNum;
            }
        }

        StringBuffer sb=new StringBuffer();
        sb.append(scNum);
        sb.append(hNum);

        return Integer.parseInt(sb.toString());
    }


    public static void main(String[] args) {
        int input1[]={12, 2, 36, 10, 217, 36, 5, 36, 15, 10};
        int input2=input1.length;
        System.out.println(from2partPassword(input1,input2));
    }
}
