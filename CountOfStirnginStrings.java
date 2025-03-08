import java.util.*;
public class CountOfStirnginStrings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();

        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for(int i=0;i<s.length();i++)
        
        {
            char ch=s.charAt(i);
            if(map.containsKey(ch))
                map.put(ch,map.get(ch)+1);//returnss the value of the key
            else    
                map.put(ch,1);
        }

        for(Map.Entry<Character,Integer>entry:map.entrySet())
        {
            System.out.printf("%c%d",entry.getKey(),entry.getValue());
        }
            
        
        
    }
}
