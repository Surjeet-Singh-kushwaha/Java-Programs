import java.util.*;
public class BubbleSort {
    public static void bubbleSort(int arr[]){
        int n = arr.length;
        for(int i = 0;i<n;i++){
            for(int j =0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                   int temp = arr[j];
                   arr[j]=arr[j+1];
                   arr[j+1] =temp;
                }
            }
        }
    }
    public static void main(String arg[]){
        int arr[]={13,46,24,52,20,9};
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
