

public class LinearSearch {
    public static void isPresent(int Arr[], int key){
           for(int i=0;i<Arr.length;i++){
            if(Arr[i]==key){
                System.out.println(key+" is present at index "+i);
                return;
            }
           }
           System.out.println(key+" is not present in the Array");
    }
    public static void main(String[] args) {
        int Arr[]  ={23,34,22,75,34,76,34,55,12};  
        int n=75;
        isPresent(Arr, n);    
    }
}
