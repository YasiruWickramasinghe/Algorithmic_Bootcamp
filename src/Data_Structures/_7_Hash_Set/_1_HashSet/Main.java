package Data_Structures._7_Hash_Set._1_HashSet;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Creating a HashSet
        Set<String> fruits = new HashSet<>();

        // Adding elements to the HashSet
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Banana");

        // Displaying elements in the HashSet
        //Remove Duplicates
        System.out.println("Fruits (HashSet): " + fruits);
    }
}

