public class LargestSmalestDigit {
    public static void main(String arg[]){
        int num = 7959754;
        int smallest_digit = 10;
        int largest_Digit=0;
        while (num>0) {
            int rem = num%10;
            if(rem>largest_Digit){
                largest_Digit =rem;
            }
            if(rem<smallest_digit){
                smallest_digit=rem;
            }
            num = num/10;
        }

        System.out.println("Largest Digit in "+num+"is:"+ largest_Digit);
        System.out.println("Smallest Digit in "+num+"is:"+ smallest_digit);
    }
}
