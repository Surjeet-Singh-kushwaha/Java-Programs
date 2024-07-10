public class TilingProblem {
    static int filltilling(int n){
        if(n==0||n==1){
            return 1;
        }

        int hrfill = filltilling(n-2);
        int vrfill = filltilling(n-1);
        return hrfill+vrfill;
    }
    public static void main(String[] args) {
        int n =4;
        System.out.println("Total number of ways:"+filltilling(n));
    }
}
