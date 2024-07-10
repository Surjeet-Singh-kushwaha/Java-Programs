import java.util.*;

public class FrequncyofElem {
   public static void main(String argStrings[]) {
      int ar[] = { 23, 23, 54, 64, 34, 54, 101, 20, 101, 20, 54, 64 };
      boolean Visted[] = new boolean[ar.length];
      System.out.println("number  :  frequency");
      for (int i = 0; i < ar.length; i++) {
         int count = 0;
         if (Visted[i] == true) {
            continue;
         } else {
            count = 1;
            System.out.print(ar[i] + "  :  ");
            for (int j = i + 1; j < ar.length; j++) {
               if (ar[i] == ar[j]) {
                  Visted[j] = true;
                  count++;
               }
            }
         }

         System.out.println(count);
      }

   }
}
