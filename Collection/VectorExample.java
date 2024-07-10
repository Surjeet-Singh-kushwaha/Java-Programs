// package Collection;
import java.util.*;
public class VectorExample {
    public static void main(String ar[]){
        Vector<Integer> Arr = new Vector<>();
        int arr[] ={23,42,14,36};
        for(int i =0;i<arr.length;i++){
              Arr.add(arr[i]);
        }
      System.out.println(Arr.get(0));
      System.out.println(Arr.elementAt(0));
      System.out.println(Arr.size());
      System.out.println(Arr.toString());
      String str = 5+"45";
      System.out.println(str);
      Collections.sort(Arr);
      System.out.println(Arr);
    }
    
}
