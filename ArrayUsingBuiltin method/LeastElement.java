import java.util.*;

public class LeastElement {
 public static void main(String args[]){
    int n = 4;
    int Arr[] = new int[n];
    System.err.println("Enter element:");
   Scanner sc = new Scanner(System.in);
   for(int i=0;i<Arr.length;i++){
    Arr[i]=sc.nextInt();
   }
   Arrays.sort(Arr);
   System.out.println("Smalles Element is: "+Arr[0]);
   System.out.println("Largest Element is: "+Arr[Arr.length-1]);
   System.out.println("Second Smallest Element is: "+Arr[1]);
   System.out.println("Second Largest Element is: "+Arr[Arr.length-2]);
   sc.close();
 }   
}
