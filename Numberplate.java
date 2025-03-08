import java.util.*;
public class Numberplate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String r="TN37A4567";
        int n=r.length();
        String last=r.substring(n-4);

        
        if((r.substring(0,2).equals("TN")) )
        {
            System.out.print("Tamilnadu");
        }
        else if(r.substring(0,2).equals("KL"))
        {
            System.out.print("Kerala");
        }
        else if(r.substring(0,2).equals("KA"))
        {
            System.out.print("Karnatak");
        }
        boolean isfancy=false;
        if(last.length()==1 && Character.isDigit(last.charAt(0)))
        {
            isfancy=true;
        }
        else if(last.charAt(0)==last.charAt(1)&&
                last.charAt(1)==last.charAt(2)&&
                last.charAt(2)==last.charAt(3))
        {
            isfancy=true;
        }
        else if((last.charAt(1)==last.charAt(0)+1 &&
                last.charAt(2)==last.charAt(1)+1 &&
                last.charAt(3)==last.charAt(2)+1)||
                (last.charAt(1)==last.charAt(0)-1 &&
                last.charAt(2)==last.charAt(1)-1 &&
                last.charAt(3)==last.charAt(2)-1)
                )
        {
            isfancy=true;
        }
        System.out.println();
        if(isfancy)
        {
            System.out.print("Fancy");
        }
        else 
        System.out.print("Not Fancy");
            
           
    }
}
