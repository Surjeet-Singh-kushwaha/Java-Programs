// Example 1:
// Input: 18
// Output: Abundant Number
// Explanation: Divisors of 18 are 1,2,3,6,9. 1+2+3+6+9=21, Since 21 is greater than 18, 18 is an abundant number.

import java.util.*;

public class AbundantNumber {
    public static void main(String a[]) {
        Scanner sc = new Scanner(System.in);
        int factor_sum = 0;
        int n = sc.nextInt();
        for (int i = 1; i <= n / 2 + 1; i++) {
            if (n % i == 0) {
                factor_sum += i;
            }
        }
        if(factor_sum>n){
            System.out.println(n+" is abundant Number");
        }
        else{
            System.out.println(n+" is not abundant Number");
        }
        sc.close();
    }
}
