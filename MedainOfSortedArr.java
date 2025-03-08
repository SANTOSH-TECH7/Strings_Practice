
import java.util.Arrays;

public class MedainOfSortedArr {
    public static void main(String[] args) {
        int num1[]={1,2};
        int num2[]={3,4};
        int n=num1.length,m=num2.length;
        int j=0;
        int narr[]=new int[n+m];
        for(int i=0;i<n;i++)
        {
           narr[j]=num1[i];
           j++;
        }
        for(int i=0;i<m;i++)
        {
            narr[j]=num2[i];
            j++;
        }
        Arrays.sort(narr);
        
        if((n+m)%2==1)  
        {
            System.out.print(narr[(n+m)/2]);
        }
        else{
            int mid1=narr[(n+m)/2-1];
            int mid2=narr[(n+m)/2];
            System.out.print((mid1+mid2) /2.0);
        }
        

        
        
    }
}