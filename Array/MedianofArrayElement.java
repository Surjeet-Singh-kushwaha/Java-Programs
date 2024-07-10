import java.util.*;

public class MedianofArrayElement {
    public static void main(String arg[]){
        int arr[]={2,4,1,3,5};
        Arrays.sort(arr);
        int mid=n/2 ;
        int n= arr.length;
        int Median =0;
        if(n%2==1){
          
            System.out.println(mid);
            Median = arr[mid];
            System.out.println("Median of the array is: "+Median);
        }
        else{
          Median = (arr[mid]+arr[mid+1])/2;
        }
    }
}
