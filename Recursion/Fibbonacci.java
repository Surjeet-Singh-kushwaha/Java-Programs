

public class Fibbonacci {
    static int fib(int n){
        if(n==1){
            return 0;
        }
        if(n==2){
            return 1;
        }
        return fib(n-2)+fib(n-1);
    }

    static void printFibbonaci(int n){
        if(n==1){
            System.out.print(0+" ");
            return;
        }
        printFibbonaci(n-1);
        System.out.print(fib(n)+" ");
    }
    public static void main(String[] args) {
        int n =25;
        System.out.printf("%d term of fibbonaci series: %d\n",n,fib(n));
        printFibbonaci(n);
    }
}
