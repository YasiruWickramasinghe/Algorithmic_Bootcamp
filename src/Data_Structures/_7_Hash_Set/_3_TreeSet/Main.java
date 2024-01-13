package Data_Structures._7_Hash_Set._3_TreeSet;

import java.util.TreeSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Creating a TreeSet
        Set<String> fruits = new TreeSet<>();

        // Adding elements to the TreeSet
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("Apple");

        // Displaying elements in the TreeSet
        System.out.println("Fruits (TreeSet): " + fruits);
    }
}

