import java.util.*;
class frequencycounter{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the name:");
        String a=sc.nextLine();
        int n=a.length();
        System.out.println("Enter the char");
        char m=sc.next().charAt(0);
        int count=0;
        int max = 0;
        for(int i=0;i<n;i++)
        {
            if(m==a.charAt(i))
            {
                count++;
            }


        }
        System.out.print(count);
    }
}