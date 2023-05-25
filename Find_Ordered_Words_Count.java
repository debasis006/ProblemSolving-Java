import java.util.Scanner;

public class Find_Ordered_Words_Count
{
    public static int  findOrderWords(String inp1) {
		int ans = 0,count=0;
		
		String words[] = inp1.split(" ");//accept Van
		for (int i = 0; i < words.length; i++) {
			count = 0;
			for (int j = 0; j < words[i].length()-1; j++) {
				if((int)words[i].charAt(j) <= (int)words[i].charAt(j+1)) 
					count++;
			}
			if (count == words[i].length()-1) ans++;
		}
		return ans;
	}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input1=sc.nextLine();
        System.out.println(findOrderWords(input1));
    }
}