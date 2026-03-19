public class missing {
    public static void main(String[] args) {
        int[] a = {1,2,3,5,6};
        int n = 6;

        int total = n * (n + 1) / 2;
        int s = 0;

        for(int i=0;i<a.length;i++){
            s += a[i];
        }

        System.out.println(total - s);
    }
}