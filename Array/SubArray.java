import java.util.*;
public class SubArray {
    static  public void printSubArray(int arr[]){
     int n =arr.length;
     for(int i=0;i<n;i++){
        for(int j=i;j<n;j++){
             for(int k =i;k<=j;k++){
                System.out.print(arr[k]+" ");
             }
             System.out.println();
        }
        System.out.println();
     }
    }
     public static int maxProductSubArray(int arr[]){
        int reuslt =0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int product =1;
                for(int k=i;k<=j;k++){
                    product*=arr[k];
                    reuslt = Math.max(reuslt,product);
                }
             
            }
           
        
        }
        return reuslt;
     }
    public static void main(String arg[]){
       int arr[] ={1,2,-3,0,-4,-5};
       printSubArray(arr);
       System.out.println(maxProductSubArray(arr));
    }
}
