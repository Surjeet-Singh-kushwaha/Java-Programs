

public class BinarySearch {
    public static void isPresent(int Arr[], int key){
        int first = 0;
        int last = Arr.length-1;
        int count =0;
        while (first<=last) {
            count++;
            int mid =(first+last)/2;
            if(Arr[mid]==key){
                System.out.println(key+" is present at index "+mid);
                return;
            }
            else if(key<Arr[mid]){
                last = mid-1;
            }
            else {
                first=mid+1;
            }
            
        }
        System.out.println(key+" is not present in the Array"+ count);
        
    }
    public static void main(String[] args) {
        int Arr[]  ={12,14,34,45,65,76,89};  
        int n=89;
        System.out.println("print ");
        isPresent(Arr, n); 
        System.out.println("Hello");
    }
}
