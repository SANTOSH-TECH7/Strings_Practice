public class HalfStringRev {
    public static void main(String[] args) {
        String s = "placementseasoncoimbatore";
        int n = s.length();
        int m=n/2;
        StringBuilder res = new StringBuilder();

        // Reverse first half
        for(int i=(n/2)-1;i>=0;i--)
        {
                res.append(s.charAt(i));
            
        }
        if(n%2==1)
        {
            res.append(s.charAt((n/2)));
        }
        for(int i=n-1;i>=((n+1)/2);i--)
        {
            res.append(s.charAt(i));
        }

        System.out.print(res.toString()); // Expected output: "aestnemecalpserotabmiocno"
    }
}
