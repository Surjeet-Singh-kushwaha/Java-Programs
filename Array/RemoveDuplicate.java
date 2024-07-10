import java.util.*;

public class RemoveDuplicate {
  static void removeDuplicate(int arr[]) {
    int temp[] = new int[arr.length];
    for (int i = 0; i < arr.length; i++) {
      if (i == 0) {
        temp[i] = arr[i];
      }
      int count = 0;
      for (int j = 0; j < i; j++) {
        if (arr[i] == temp[j]) {
          count++;
          break;
        }
      }
      if (count != 1) {
        temp[i] = arr[i];
      }
      System.out.print(temp[i]);
    }
  }

  static void removeDuplicate2(int arr[]) {
    HashSet<Integer> set = new HashSet<>();
    for (int i : arr) {
      set.add(i);
    }
    int i = 0;
    System.out.println(set);
    for (int element : set) {
      System.out.println(element);
      arr[i++] = element;
    }
  }

  public static void main(String arg[]) {
    int arr[] = { 1, 1, 2, 2, 2, 3, 3 };
    System.out.println(Arrays.toString(arr));
    removeDuplicate(arr);
    System.out.println(Arrays.toString(arr));
  }
}
