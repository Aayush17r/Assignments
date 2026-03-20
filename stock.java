public class stock {
    public static void main(String[] args) {
        int[] p = {7,1,5,3,6,4};

        int min = Integer.MAX_VALUE;
        int ans = 0;

        for(int i=0;i<p.length;i++){
            if(p[i] < min) min = p[i];
            else if(p[i]-min > ans) ans = p[i]-min;
        }

        System.out.println(ans);
    }
}
