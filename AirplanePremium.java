public class AirplanePremium {
    public static void main(String[] args) {
    int n=7126;
    String str=String.valueOf(n);
    int osum=0;
    int esum=0;
    for(int i=0;i<str.length();i++)
    {
        // converts char to integer value
        int digit = str.charAt(i) - '0'; 
        if(i%2!=0)
        {
            osum+=digit;

        }
        esum+=digit;
    }
    if(esum>osum)
    {
        System.out.print("Premium Seat");
    }
    else    
        System.out.println("Standar");
}
}
