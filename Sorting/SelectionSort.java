package Sorting;
import java.util.Arrays;

public class SelectionSort {
    static void selectionSort(int arr[]){
        int n=arr.length;
        for(int i =0;i<n;i++){
            int min =i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min]){
                    min =j;
                }
            }
            int temp = arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
    
        }
    }
    public static void main(String arg[]){
        int arr[]={13,46,24,52,20,9};
        System.out.println(Arrays.toString(arr));
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
