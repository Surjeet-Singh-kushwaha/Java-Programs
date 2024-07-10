//NVERTED & ROTATED HALF-PYRAMID pattern
public class rottedHalfPyramid {
    public static void main(String args[]){
        int lines=5;
    for(int i=1;i<=lines;i++){
        for(int j=1;j<=lines-i;j++){
            System.out.print(" ");

        }
        for(int k=1;k<=i;k++){
            System.out.print("*");
        }
        System.out.println();
     }
}  
    
}
