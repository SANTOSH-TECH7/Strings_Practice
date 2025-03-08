
import java.util.Scanner;

public class Range_count {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        
        int [] arr = new int[size];
        for (int i = 0; i < size; i++){
            arr[i] = scan.nextInt();
        }
        int range = scan.nextInt();

        for (int i = 1; i <= range; i++){
            int r1 = scan.nextInt();
            int r2 = scan.nextInt();
            int count = 0;
            for (int j = 0; j < size; j++){
                if (arr[j]>= r1 && arr[j]<= r2){
                    count++;
                }
            }
            System.out.print(count+" ");
        }
        scan.close();
    }

}
