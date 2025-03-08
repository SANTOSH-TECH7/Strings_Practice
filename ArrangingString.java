import java.util.*;
public class ArrangingString {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        String str=sc.nextLine();
        boolean visited[]=new boolean[str.length()];
        StringBuilder res=new StringBuilder();
        for(int i=0;i<str.length();i++)
        {
            if(visited[i])continue;
            for(int j=0;j<str.length();j++)
            {
                if(str.charAt(i)==str.charAt(j))
                {
                    res.append(str.charAt(j));
                    visited[j]=true;
                }
            }
            
        }
        System.out.print(res.toString());
    }
}
