// package ArrayUsingBuiltin method;
import java.util.*;

public class Frequency {
    public static void main(String ar[]){
        int arr[]={12,32,40,10,10,33,10,10,32,40,33};
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
              int fre = map.get(arr[i]);
              map.put(arr[i],fre+1);
            }
            else{
                map.put(arr[i],1);
            }
        }
      
        for(Integer key :map.keySet()){
            System.out.println(key+"   : "+map.get(key));
        }
    }
}
