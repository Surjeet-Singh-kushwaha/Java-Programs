

public class DecrNumber {
    public static void decreaseNumber(int n){
        if(n==1){
            System.out.print(1);
            return;
        }
    System.out.print(n+" ");
    decreaseNumber(n-1);
    }
    public static void main(String arg[]){
        int n =6;
        decreaseNumber(n);
    }
}
