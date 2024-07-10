// package Recursion;

public class SortedArray {
    static boolean isSorted(int arr[], int index){
        if(index ==arr.length-1){
            return true;
        }
if(arr[index]>arr[index+1]){
    return false;
}
return isSorted(arr, index+1);
    }
    public static void main(String[] args) {
        int arr[] = { 12,57 ,34 ,54,67};
        if(isSorted(arr,0)){
            System.out.println("Array is sorted");
        }
        else{
        
            System.out.println("Array is not sorted");
        }
        
    }
}
