public class SumOFConsecutiveDigit {
    public static void main(String[] args) {
        int n=243;
        String s=String.valueOf(n);
        int sum=0;
        for(int i=1;i<s.length();i++)
        {
           int mul=Character.getNumericValue(s.charAt(i))*Character.getNumericValue(s.charAt(i-1));
           sum+=mul;


        }
        System.out.println(sum);
    }
    
}
