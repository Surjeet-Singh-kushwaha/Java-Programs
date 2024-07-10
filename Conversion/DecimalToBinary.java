

public class DecimalToBinary {
    public static void main(String args[]) {
        int num = 9;
        int binary = 0;
        int multiplicator = 1;
        while (num > 0) {
          int rem = num%2;
          binary = multiplicator*rem+binary;
          multiplicator*=10;
          num/=2;
        }
    System.out.println("Decimal to binary:"+binary);
    }
}
