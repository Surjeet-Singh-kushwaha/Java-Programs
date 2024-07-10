import  java.util.*;

public class ReverseArr {
    static void reverse(int arr[]){
        for(int i=0;i<arr.length/2;i++){
            int temp = arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
        }
    }
    public static void main(String arg[]){
    System.out.println("Enter element:");
    Scanner sc = new Scanner(System.in);
    int n =5;
    int Arr[]= new int[n];
    for(int i=0;i<Arr.length;i++){
        Arr[i]=sc.nextInt();
    }
    System.out.println(Arrays.toString(Arr));
    reverse(Arr);
    System.out.println(Arrays.toString(Arr));
    sc.close();
    }
}
