// package Conversion;

public class DecimaltoOctal {
  public static void main(String arg[]){
    int oct =0;
    int decimal = 45;
    int multiplicator = 1;
    while (decimal>0) {
        int rem = decimal%8;
        oct = oct+rem*multiplicator;
        multiplicator *=10;
        decimal/=8;
        
    }
    System.out.println("Octal: "+oct);
  }  
}
