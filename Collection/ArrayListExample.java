
import java.util.*;
public class ArrayListExample {
    public static void main(String[] args) {
        // Create an ArrayList using generics
        ArrayList<Object> myList = new ArrayList<>();

        // Add elements of different data types
        myList.add("Hello"); // String
        myList.add(123); // Integer
        myList.add(3.14); // Double

        // Retrieve elements
        for (Object element : myList) {
            System.out.println(element);
        }
    }
}
