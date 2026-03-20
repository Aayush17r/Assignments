import java.util.*;

public class zeroToend {
    public static void main(String[] args) {
        int[] a = {0,1,0,3,12};
        int j = 0;

        for(int i=0;i<a.length;i++){
            if(a[i]!=0){
                int t = a[i];
                a[i] = a[j];
                a[j] = t;
                j++;
            }
        }

        System.out.println(Arrays.toString(a));
    }
}
