import java.util.Scanner;

public class PalindromeNumber {
    public static boolean isPallindrom(int n) {
        int temp = n;
        int rev = 0;
        while (n > 0) {
            int rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }
        if (temp == rev) {
            return true;
        }
        return false;
    }

    public static void main(String args[]) {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        for (int i = 1; i < 1000; i++) {
            if (isPallindrom(i)) {
                System.out.print(i + "  ");
            }
        }

    }
}
