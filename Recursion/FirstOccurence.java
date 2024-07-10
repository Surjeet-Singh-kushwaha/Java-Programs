// package Recursion;

public class FirstOccurence {
    static int firstOccur(int arr[],int key , int index){
        if(index==arr.length){
            return -1;
        }
        if(arr[index]==key){
            return index;
        }

        return firstOccur(arr, key, index+1);
    }
static int lastOccurance(int arr[],int key , int index){
    if(index == arr.length){
        return -1;
    }
    int result = lastOccurance(arr, key, index+1);
    if(result == -1&&arr[index]==key){
        return index;
    }
       return result;
}
  public static void main(String[] args) {
    int arr[]={23,43,65,76,87,65,67};
    int key=23;
    System.out.println("first occurance of element is:"+ lastOccurance(arr , key , 0));
  }
    
}
