class  change {
    static void process(String a)
    {
        StringBuilder sb=new StringBuilder(a);
        for(int i=0;i<a.length();i++)
        {
            char current=a.charAt(i);
            if(current=='a'|| current=='A'||current=='e'||current=='E'||current=='i'||
            current=='I'|| current=='o'|| current=='O' || current=='u'||current=='U')
            {
                sb.append('*');
            }
            else
            {
                sb.append('#');
            }
        }
        System.out.print(sb.toString());
    }

}
    

class Changingvowels{
    public static void main(String args[])
    {
        String a="HELLO";
        change.process(a);
    }
}