public class butterFly {
    public static void printPattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");

            }
            for(int k=1;k<=(n-i)*2;k++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(" *");

            }
            
            System.out.println();
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print("* ");

            }
            for(int k=1;k<=(i-1)*2;k++){
                System.out.print("  ");
            }
            for(int j=1;j<=n-i+1;j++){
                System.out.print("* ");

            }
            
            System.out.println();
        }
    }
    public static void main(String args[]){
printPattern(5);
    }
}
