public class DigitalLock {
    public static void main(String[] args) {
        long num=123321;
        String s=String.valueOf(num);
        int n=s.length();
        int n1sum=0,n2sum=0;
        for(int i=0;i<n;i++)
        {
            int digit= s.charAt(i)-'0';
            if(i<n/2)
            {   
                n1sum+=digit;
            }
            else
                n2sum+=digit;

        }
        if(n1sum==n2sum)
            System.out.println("Valid");
        else    
            System.out.println("Invalid");
    }
}
