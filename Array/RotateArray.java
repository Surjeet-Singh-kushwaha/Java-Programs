import java.util.*;
class RotateArray{
    public static void main(String arg[]){
        int[] arr = {1,2,3,4,5,6,7};
         System.out.println(Arrays.toString(arr));
        int n = arr.length;
        int k = 3;

        int first[] = new int[k];
        int last[]=new int[n-k];
        
        for(int i =0;i<n;i++){
            if(i<k){
                first[i]=arr[i];
            }
            else{
               
                last[i-k]=arr[i];
            }
        }
        for(int i=0;i<n;i++){
            if(i>=last.length){
                arr[i]=first[i-last.length];
            }
            else{
                arr[i]=last[i];
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}