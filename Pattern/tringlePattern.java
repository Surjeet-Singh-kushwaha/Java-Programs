// Program to print triangle
public class tringlePattern {
   static void pattern(int n ){
        for(int i=1;i<=n;i++)
        {
            for(int j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int n =8;
      pattern(n);

    }
}



