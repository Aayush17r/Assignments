import java.util.*;

public class sort {
    public static void main(String[] args) {
        int[] a = {2,0,2,1,1,0};

        int c0=0,c1=0,c2=0;

        for(int x:a){
            if(x==0) c0++;
            else if(x==1) c1++;
            else c2++;
        }

        int i=0;

        while(c0-- >0) a[i++]=0;
        while(c1-- >0) a[i++]=1;
        while(c2-- >0) a[i++]=2;

        System.out.println(Arrays.toString(a));
    }
}
