import java.util.*;
class ReverseString{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the name:");
        String a=sc.nextLine();
        int n=a.length();
        int start =0;
        int end=n-1;
        char ichar;
        char echar;
        for(int i=end;i>=start;i--)
        {
             char ch=a.charAt(i);
             System.out.print(ch+ " ");
        }

        
    }
}