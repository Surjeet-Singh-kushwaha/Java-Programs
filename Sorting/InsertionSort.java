
import java.util.Arrays;

public class InsertionSort {
    static void insertionSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
        }
    }

    public static void main(String arg[]) {
        int arr[] = { 13, 46, 24, 52, 20, 9 };
        System.out.println(Arrays.toString(arr));
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
