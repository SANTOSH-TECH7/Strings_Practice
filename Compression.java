import java.util.*;
public class Compression {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str1="aabcccccaaa";
        int count =0;
        StringBuilder res=new StringBuilder();
        if(str1.length()==0 || str1==null)
        {
            System.out.println(str1);
            return;
        }
        for(int i=0;i<str1.length();i++)
        {
           count++;
           if(i+1>=str1.length()|| str1.charAt(i)!=str1.charAt(i+1))
           {
                res.append(str1.charAt(i)); 
                res.append(count);
                count=0;
           }
        }

        System.out.print(res.toString());
    }
}
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
// import java.util.*;
// class Main {
//     public static void main(String[] args) {
//         System.out.println("Try programiz.pro");
//         String s="aaaabbbbccc";
//         int n=s.length();
//         StringBuilder res=new StringBuilder();
//         if(s==null||n==0)
//         {
//             System.out.print("Invalid0");
//             return;
//         }
//         int count=0;
//         for(int i=1;i<n;i++)
//         {
            
//             if(s.charAt(i)==s.charAt(i-1))
//                 count++;
//             else
//             {
//                 res.append(s.charAt(i-1)).append(count);
//                 count=1;
//             }
//         }
//         res.append(s.charAt(n-1)).append(count);
//         System.out.print(res.toString());
//     }
// }




