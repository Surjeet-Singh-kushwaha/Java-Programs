import java.util.*;
class EquilibriumIndex{
    static int CalculateEqulibriumIndex(int arr[]){

        int n = arr.length;
        for(int i=0;i<n;i++){
            int leftSum=0;
            for(int j =0;j<i;j++){
                leftSum +=arr[j];
            }
            int rightSum=0;
            for(int j =i+1;j<n;j++){
                rightSum+=arr[j];
            }

            if(leftSum==rightSum){
                return i;
            }
        }
        return -1;
    }
public static void main(String arf[]){
    int Arr[] ={1,-1,4};
    int equiIndex = CalculateEqulibriumIndex(Arr);
    
 System.out.println(equiIndex);
}}