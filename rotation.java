import java.util.*;

public class rotation {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int k = 2;
        int n = a.length;

        int[] b = new int[n];

        for(int i=0;i<n;i++){
            b[(i+k)%n] = a[i];
        }

        System.out.println(Arrays.toString(b));
    }
}
