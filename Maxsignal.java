// the 0's or 1's should be consecutive and it should only be at the centre and the number which is repeating 
// the most should not ne at the begining and at the end 
public class Maxsignal {
    public static void main(String[] args) {
       
        String s="101111010";
        int n=9;
        int count=1,maxsig=0;
        for(int i=1;i<n;i++)
        {
            if(s.charAt(i)==s.charAt(i-1))
            {
                count++;
            }
            else
            {
                if(i!=1&&i!=n-1)
                {
                    maxsig=Math.max(maxsig,count);
                }
            }
        }
        System.out.print(maxsig);
    }
}
    
