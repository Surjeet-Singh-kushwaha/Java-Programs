import java.util.*;

// staircase search: sorting element in a sorted matrix row and col wise
public class SearchingInSorted {
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

    public static void searchStairCase(int arr[][], int key){
        int row =0, col = arr[0].length-1;
        while(row<arr.length && col>=0){
        if(arr[row][col]==key){
         System.out.println(key+" found at ("+row+" , "+col+" )");
         return;
        }
        else if(key<arr[row][col]){
          col--;
        }
        else{
            row++;
        }
    }
    }
    public static void main(String[] args) {
        int Arr[][] = {
                { 3, 5, 8 },
                { 5, 6, 20 },
                // { 56 , 35 ,56 },
                { 7, 8, 22 }
        };
        displayArr(Arr);
        searchStairCase(Arr, 7);
      
    }
}
