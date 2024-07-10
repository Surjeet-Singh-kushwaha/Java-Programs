import java.util.*;

public class BinaryToDecmalcon {
   public static void main(String ar[]){
    Scanner sc = new Scanner(System.in);
    int binary = 111;
    int decimal =0;
    int pow=1;
     while(binary>0){
        int rem = binary%10;
        decimal = decimal+rem*pow;
        pow*=2;
        binary/=10;
     }
System.out.println("Binary  to decimal:"+decimal);
   } 
}
