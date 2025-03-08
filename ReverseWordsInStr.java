
class ReverseWordsInStr{
    public static void main(String[] args) {
       String s1="Hello world, this is Java!";
    //   String s2="ab";
       String s3[]=s1.split(" ");
       StringBuilder res=new StringBuilder();
       for(String s:s3)
       {
           StringBuilder rev=new StringBuilder(s);
           res.append(rev.reverse().toString()).append(" ");
       }
       System.out.print(res.toString());
        
    }
}