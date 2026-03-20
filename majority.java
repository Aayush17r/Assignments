public class majority {
    public static void main(String[] args) {
        int[] a = {1,2,3,1,2,1,1};
        int n = a.length;

        for(int i=0;i<n;i++){
            int c = 0;

            for(int j=0;j<n;j++){
                if(a[i]==a[j]) c++;
            }

            boolean used = false;
            for(int k=0;k<i;k++){
                if(a[k]==a[i]) used = true;
            }

            if(c > n/3 && !used){
                System.out.print(a[i]+" ");
            }
        }
    }
}
