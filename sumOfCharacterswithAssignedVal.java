import java.util.*;
public class sumOfCharacterswithAssignedVal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        HashMap<Character,Integer> Map=new HashMap<>();
        for(char ch='a';ch<='z';ch++)//1to 26 values assigned
        {
            Map.put(ch,ch-'a'+1);
        }
        int sum=0;
        for(int i=0;i<s.length();i++)
        {
            if(Map.containsKey(s.charAt(i)))//checks the kay values
            {
                sum+=Map.get(s.charAt(i));//returns the values of the key
            }
        }
        System.out.println(sum);
    }
}
