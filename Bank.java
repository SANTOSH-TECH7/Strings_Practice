public class Bank {
    public static void main(String[] args) {
        int n=12347;
        String s=String.valueOf(n);
        int sum=0;
        int digit=0;
        for(int i=0;i<s.length()-1;i++)
        {
            digit=Character.getNumericValue(s.charAt(i));
            sum+=digit;
        }
        if(sum==(n%10))
            System.out.println("Verified");
        else 
            System.out.println("Review");
    }
}
