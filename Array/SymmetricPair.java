import java.util.*;
public class SymmetricPair {
    public static void main(String arf[]){
        int arr[][] = {{1, 2}, {2, 1}, {3, 4}, {4, 5}, {5, 4}};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
               if(arr[i][1]==arr[j][0]&&arr[i][0]==arr[j][1]){
                System.out.println("("+arr[i][0]+" , "+arr[i][1]+")");
               }
            }
        }
    }
}
