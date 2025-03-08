public class dupicateString {
    public static void main(String[] args) {
        String s="santosh ";
       
        StringBuilder res=new StringBuilder();
        res.append(s.charAt(0));
        for(int i=1;i<s.length();i++)
        {
            char curr= s.charAt(i);
            boolean isdup=false;
            for(int j=0;j<res.length();j++)
            {
                if(curr==res.charAt(j))
                {
                    isdup=true;
                    break;
                }
            }
            if(!isdup)
            {
                res.append(curr);
            }
        }
        System.out.print(res.toString());
    }
}
