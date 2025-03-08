public class AlternateMerge {
    public static void main(String[] args) {
        String s1="abcd";
        String s2="efg";
        int n1=s1.length();
        int n2=s2.length();
        int n=Math.min(n1,n2);
        StringBuilder res=new StringBuilder();
        for(int i=0;i<n;i++)
        {
            res.append(s1.charAt(i)).append(s2.charAt(i));
        }
        if(n1>n)
        {
            res.append(s1.substring(n));
        }
        else 
            res.append(s2.substring(n));
        System.out.print(res.toString());
    }
}
