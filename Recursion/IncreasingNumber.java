

public class IncreasingNumber {
    public static void incrNumber(int n){
        if(n==1){
            System.out.print(n+" ");
            return ;
        }
        incrNumber(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        int n =6;
        incrNumber(n);
    }
}
