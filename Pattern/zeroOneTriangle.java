public class zeroOneTriangle {
    public static void printPattern(int lines){

        for(int i=1;i<lines;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print(1+" ");
                }
                else{
                     System.out.print(0+" ");
                    }
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        printPattern(7);
    }
}
