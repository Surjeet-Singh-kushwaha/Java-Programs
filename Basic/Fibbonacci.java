public class Fibbonacci {
    public static void main(String arg[]){
        int n =5;
        int first =0,second =1;
        for(int i =1;i<=5;i++){
            System.out.print(first+" ");

            int nxt = first+second;
            first = second;
            second=nxt;
        }

    }
}
