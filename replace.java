import java.util.Scanner;

    public class replace {
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter the name:");
            String a=sc.nextLine();
            System.out.print("Enter the pos:");
            String pos=sc.nextLine();
            System.out.print("Enter the char to replace:");
            char ch=sc.next().charAt(0);
            System.out.print(a.replace(pos,ch));
        }
        
            
}
