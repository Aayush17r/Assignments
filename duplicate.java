public class duplicate {
    public static void main(String[] args) {
        int[] a = {1,2,3,2,4,3};

        for(int i=0;i<a.length;i++){
            boolean seen = false;

            for(int k=0;k<i;k++){
                if(a[k]==a[i]){
                    seen = true;
                    break;
                }
            }

            if(seen) continue;

            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    System.out.print(a[i]+" ");
                    break;
                }
            }
        }
    }
}
