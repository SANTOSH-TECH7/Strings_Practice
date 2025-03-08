import java.util.*;
public class StringtoAlphabetical {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char arr[]=s.toCharArray();
        Arrays.sort(arr);
        System.out.print(arr);
           
    }
   
}
