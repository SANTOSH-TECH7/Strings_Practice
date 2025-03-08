/
import java.util.*;
class AddBinaryStrings {
    public static void main(String[] args) {
       String s1="101";
       String s2="100";
       int n1=Integer.parseInt(s1);
       int n2=Integer.parseInt(s2);
       int s3=n1 & n2;
       System.out.print(s3);
    }
}