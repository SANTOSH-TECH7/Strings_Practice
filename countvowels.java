import java.util.*;
class countvowels{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the name:");
        String a=sc.nextLine();
        int n=a.length();
        char [] v={ 'a','e','i','o','u'};
        int m=v.length;
        int count=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n-1;j++)
            {
                if(v[i]==a.charAt(j))
                {
                    count++;
                }
            }
        }
        System.out.print(count);
        

        
    }
}