
import java.util.*;

public class DiagonalSum {
    // printing matrix element 
    static void displayArr(int Arr[][]) {
        System.out.println("Marix is: ");
        for (int row[] : Arr) {
            for (int i : row) {
                System.out.print(i + "  ");
            }
            System.out.println();
        }
    }
    static void diagonalSum(int arr[][]){
        int row = arr.length;
        int col = arr[0].length-1;
        int PdiagonalSum =0;
        int SecdiagonalSum =0;
        for(int i =0;i<row;i++){
           PdiagonalSum+=arr[i][i];
        }
        for(int i =0;i<row;i++){
           SecdiagonalSum+=arr[i][col-i];
        }
        System.out.println("Sum of primary diagonal Element is : "+PdiagonalSum);
        System.out.println("Sum of secondary diagonal Element is : "+SecdiagonalSum);
    }
    public static void main(String[] args) {
        int Arr[][] = {
            { 56, 45, 56 },
            { 21 , 24 ,52 },
            // { 56 , 35 ,56 },
            { 75 , 65 ,32 }
    };
displayArr(Arr);
diagonalSum(Arr);
    }
}
