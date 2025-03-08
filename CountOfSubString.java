//count occurence of the substring
class CountOfSubString {
    public static void main(String[] args) {
       String s1="tigerti";
       String s2="ti";
       s1=s1.toLowerCase();
       s2=s2.toLowerCase();
       int count=0;
       int index=s1.indexOf(s2);//returns the index of first occurence of the string
       while(index!=-1)
       {
           count++;
           index=s1.indexOf(s2,index+1);//increments string
       }
       System.out.print(count);
       
    }

  
// import java.util.*;
// class Main {
//     public static void main(String[] args) {
//        String s1="tigerti is always tiger";
//        String s2="ti";
//        String s3[]=s1.split(" ");
//        int count=0;
//        for(String s:s3)
//        {
//            int index=s.indexOf(s2);
//            while(index!=-1)
//            {
//                count++;
//                index=s.indexOf(s2,index+1);
//            }
//        }
//        System.out.print(count);
        
//     }
// }
// }