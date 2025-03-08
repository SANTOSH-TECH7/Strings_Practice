import java.util.Arrays;

public class SearchRange {
    public static void main(String[] args) {
        int arr[] = {5, 7, 7, 8, 8, 10};
        int k = 8;
        
        int[] result = findRange(arr, k);
        System.out.println("First and Last Index: " + Arrays.toString(result));
    }

    public static int[] findRange(int[] arr, int k) {
        int first = -1, last = -1;

        // Finding the first and last occurrence of k
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == k) {
                if (first == -1) {
                    first = i; // First occurrence
                }
                last = i; // Update last occurrence
            }
        }
        return new int[]{first, last}; // Return range
    }
}
