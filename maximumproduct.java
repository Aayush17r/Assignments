

public class maximumproduct {
    public static void main(String[] args) {
        int[] a = {2,3,-2,4};

        int mx = a[0], mn = a[0], res = a[0];

        for(int i=1;i<a.length;i++){
            if(a[i] < 0){
                int t = mx;
                mx = mn;
                mn = t;
            }

            mx = Math.max(a[i], mx*a[i]);
            mn = Math.min(a[i], mn*a[i]);

            if(mx > res) res = mx;
        }

        System.out.println(res);
    }
}
