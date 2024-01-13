package Data_Structures._6_Hash_Map._1_HashMap;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Creating a HashMap
        Map<String, Integer> studentScores = new HashMap<>();

        // Adding key-value pairs to the HashMap
        studentScores.put("Alice", 90);
        studentScores.put("Bob", 85);
        studentScores.put("Charlie", 95);

        // Displaying key-value pairs in the HashMap
        System.out.println("Student Scores (HashMap): " + studentScores);
    }
}