public class ReverseStringValues {
    public static void main(String[] args) {
        String str=" i like this program very much";
        String str1[]=null;
        str1=str.split(" ");
        int n=str1.length;
        for (int i=n-1;i>=0;i--)
        {
            System.out.print(str1[i]+" ");
        }
    }
}
