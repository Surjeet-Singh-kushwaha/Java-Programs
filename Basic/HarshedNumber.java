public class HarshedNumber {
    public static void main(String args[]){
        int n =378;
        int temp =n;
        int digit_Sum=0;
        while(n>0){
            int rem=n%10;
            digit_Sum+=rem;
            n/=10;
        }
        if(temp%digit_Sum ==0){
            System.out.println(temp+"is a harshedNumber");
        }
      
        else{
            
            System.out.println(temp+"is not a harshedNumber");
        }
    }
}
