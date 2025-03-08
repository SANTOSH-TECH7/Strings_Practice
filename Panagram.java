import java.util.*;
public class Panagram {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        String a="the quick brown fox jumps over the lazy dog";
        String res="";
        for(int i=0;i<a.length();i++)
        {
            char ch=a.charAt(i);
            if(ch>='a' && ch<='z')
            {
                if(!res.contains(String.valueOf(ch)))
                {
                    res+=ch;
                }
            }
        }
        if(res.length()==26)
        {
            System.out.println("panagram");
        }
        else{
            System.out.println("not panagram");
        }
    }

    
}
