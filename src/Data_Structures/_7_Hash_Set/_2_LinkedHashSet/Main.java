package Data_Structures._7_Hash_Set._2_LinkedHashSet;

import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Creating a LinkedHashSet
        Set<String> fruits = new LinkedHashSet<>();

        // Adding elements to the LinkedHashSet
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Apple");
        fruits.add("Banana");

        // Displaying elements in the LinkedHashSet
        //Remove Duplicates
        System.out.println("Fruits (LinkedHashSet): " + fruits);
    }
}

