public class SuspiciousNumber {
    public static void main(String[] args) {
        long n= 9876654321l;
        String str=String.valueOf(n);
        for(int i=1;i<str.length();i++)
        {
            if(str.charAt(i)==str.charAt(i-1))
            {
                System.out.println("Suspicious");
                return;
            }

        }
        System.out.print("Safe");


    }
}
