import java.util.*;

public class merge {
    public static void main(String[] args) {
        int[] a = {1,4,7,8,10};
        int[] b = {2,3,9};

        int n=a.length,m=b.length;

        for(int i=0;i<n;i++){
            if(a[i] > b[0]){
                int t=a[i];
                a[i]=b[0];
                b[0]=t;

                int first=b[0],k;
                for(k=1;k<m && b[k]<first;k++){
                    b[k-1]=b[k];
                }
                b[k-1]=first;
            }
        }

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
}
