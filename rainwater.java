public class rainwater {
    public static void main(String[] args) {
        int[] h = {4,2,0,3,2,5};

        int l=0,r=h.length-1;
        int lm=0,rm=0;
        int w=0;

        while(l<r){
            if(h[l] < h[r]){
                if(h[l] >= lm) lm = h[l];
                else w += lm - h[l];
                l++;
            } else {
                if(h[r] >= rm) rm = h[r];
                else w += rm - h[r];
                r--;
            }
        }

        System.out.println(w);
    }
}
