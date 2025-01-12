import java.util.*;
class Demo{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the name:");
        String a=sc.nextLine();
        int count=0;
        for(int i=0;i<a.length();i++)
        {
            char ch=a.charAt(i);
             count+=1;
            System.out.print(ch+"");

        }
        System.out.println();
        System.out.print(count);
        
    }
}