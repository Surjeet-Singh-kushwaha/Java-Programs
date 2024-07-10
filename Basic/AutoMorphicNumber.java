// Check if a number is Automorphic Number
// Problem Statement: Given a number, check if it is automorphic or not. A number is called an Automorphic number if and only if its square ends in the same digits as the number itself.
// 
// Examples:
// 
// Example 1:
// Input Format: N = 76
// Result: Automorphic Number
// Explanation: Calculating 76 * 76 gives 5776, it ends with the given number.
// 
// Input Format: 25
// Result: Automorphic Number
// Explanation: Calculating 25 * 25 gives 625, it ends with the given number
import java.util.Scanner;
public class AutoMorphicNumber {
    public static boolean isAutomorphic(int n){
        int sqr = n*n;
        while(n>0){
            if((n%10)!= (sqr%10)){
              return false;
            }
            n/=10;
           }
           return true;
    }
    public static void main(String arg[]){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      if(isAutomorphic(n)){
        System.out.println(n+"is a Automorphic number");
      }
      else{
        System.out.println(n+"is not a Automorphic number");
      }
       sc.close();
    }
}
