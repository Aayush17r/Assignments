public class maxOfSubarray {
    public static void main(String[] args) {
        int[] a = {-2,1,-3,4,-1,2,1,-5,4};

        int cur = 0;
        int best = Integer.MIN_VALUE;

        for(int i=0;i<a.length;i++){
            cur += a[i];
            if(cur > best) best = cur;
            if(cur < 0) cur = 0;
        }

        System.out.println(best);
    }
}


