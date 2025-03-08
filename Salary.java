import java.util.*;
public class Salary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double sal=sc.nextDouble();
        sc.nextLine();
        String flang=sc.nextLine();
        String dept=sc.nextLine();
        long yr=sc.nextLong();
        sc.nextLine(); // Consume the newline left by nextInt()
        String degree=sc.nextLine();
        String phd=sc.nextLine();
        double inc=sal*0.25;
        double totalsal=inc+sal;
        sc.close();
        if(dept.equals("ADM"))
        {
            if(yr>5)
            {
                totalsal+=sal*0.05;
            }
        }
        else if(dept.equals("TEC"))
        {
            if(degree.equals("Yes"))
            {
                totalsal+=sal*0.03;
            }
            if(phd.equals("Yes")) 
            {
                totalsal+=sal*0.10;
            }
        }
        if(flang.equals("Yes"))
        {
            totalsal+=sal*0.02;
        }
        System.out.printf("%.6f",totalsal);
        
    }
}
