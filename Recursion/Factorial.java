

public class Factorial {
    static int fact(int n){
        if(n==0||n==1){
            return 1;
        }
        return n*fact(n-1);
    }
    public static void main(String arg[]){
        int n =5;
        System.out.printf("Factorial of %d is %d",n,fact(n));
    }
}
