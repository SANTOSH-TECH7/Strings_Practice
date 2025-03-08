class Removeduplicate {
    public static void main(String[] args) {
       String a="HELLO";
    //   String b=" ";
        String b="";
       StringBuilder sb=new StringBuilder();
       for(int i=0;i<a.length();i++)
       {
           if(i==0||a.charAt(i-1)!=a.charAt(i))//appends the first element
           {
               sb.append(a.charAt(i));
           }
       }
       System.out.print(sb.toString());


//this checks for non continous element i.e for " HELLOH"
// for this another empty string is needed

    //    for(int i=0;i<a.length();i++)
    //    {
    //     String s=String.valueOf(a.charAt(i));
    //     if(!a.contains(s))
    //     {
    //         b+=a.charAt(i);
    //     }
    //     System.out.print(b);
    //    }
    }
}







