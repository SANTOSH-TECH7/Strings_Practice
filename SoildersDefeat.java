import java.util.*;
public class SoildersDefeat {
    public static String defeatSoilders(String soilder,String pattern)
    {
        StringBuilder res=new StringBuilder();
        
        while(true)
        {
            int index=res.indexOf(pattern);
            if(index==-1)break;
            res.delete(index, index+pattern.length());
        }
        return res.length()==0?"Defeat":res.toString();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String soilder=sc.nextLine();
        String pattern=sc.nextLine();
        System.out.println(defeatSoilders(soilder, pattern));
    }
}
