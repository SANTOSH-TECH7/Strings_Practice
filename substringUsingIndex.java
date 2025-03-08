import java.util.Scanner;

public class substringUsingIndex {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the name:");
        String a=sc.nextLine();
        int start=sc.nextInt();
        int end=sc.nextInt();
        System.out.print(a.substring(start,end));
    }
}
