import java.util.*;
class Palindrome{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the name:");
        String a=sc.nextLine();
        String b=a;
        int n=a.length();
        String newstr="";
        for(int i=n-1;i>=0;i--)
        {
             char ch=a.charAt(i);
             newstr+=a.charAt(i);// adds char to new string
        }
        if(a.equals(newstr))// checks whether the strings are equal or not 
        {
            System.out.print("It is palindrome");
        }
        else{
            System.out.print("It is not palindrome");
        }

    }
}