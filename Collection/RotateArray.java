import java.util.*;
public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(arr));
       int n = arr.length;
       int k = 3;
       ArrayList<Integer> list = new ArrayList<>();
       for(int i: arr){
        list.add(i);
       }
      
       System.out.println(list);
       Collections.rotate(list, k-1);
       System.out.println(list);

    }

}
