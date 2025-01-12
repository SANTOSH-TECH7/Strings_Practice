import java.util.*;
class largestchar{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the name:");
        String a=sc.nextLine();
        int n=a.length();
        int max = 0;
        for(int i=0;i<n;i++)
        {
            if(a.charAt(i)>max){
            max = a.charAt(i);  //directly compares the ascii value of the alphabets with the numbers
            }
        }
        char m = (char) max;//converting the int val to char to get ascii
        System.out.println(m);
    }
}