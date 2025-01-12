import java.util.Scanner;

public class CharArrtoString {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the name:");
        char str[]={'a','b','c','d','e'};
        String m=" ";
        for(int i=0;i<str.length;i++)
        {
            m+=str[i];
        }
        System.out.print(m);

    }
    
}
