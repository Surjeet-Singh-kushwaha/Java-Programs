public class ArmaStrong {
    static boolean isArma(int n) {
        int temp = n;
        int number_of_digit = String.valueOf(n).length();
        int arma = 0;
        while (n > 0) {
            int rem = n % 10;
            arma = arma + (int) Math.pow(rem, number_of_digit);
            n = n / 10;
        }
        if (temp == arma) {
            return true;
        }
        return false;
    }

    public static void main(String args[]) {
        for (int i = 100; i <= 100000; i++) {
            if (isArma(i)) {
                System.out.print(i + " ");
                // System.out.print(n+"Is a armastrong Number");
            }
            // else{
            // System.out.println(n+"is not a armaS");
            // }
        }
    }
}
