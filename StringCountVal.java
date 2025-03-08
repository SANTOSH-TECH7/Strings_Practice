import java.util.*;
public class StringCountVal {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        String str=sc.nextLine();
        StringBuilder res=new StringBuilder();
        boolean visited[]=new boolean[str.length()];
        for(int i=0;i<str.length();i++)
        {
            if(visited[i])continue;
            char ch=str.charAt(i);
            int count=0;
            for(int j=0;j<str.length();j++)
            {
                if(str.charAt(i)==str.charAt(j))
                {
                    count++;
                    visited[j]=true;
                }
            }
            res.append(ch).append(count);
           
            
        }
        System.out.print(res.toString());
        
        
    }
}


