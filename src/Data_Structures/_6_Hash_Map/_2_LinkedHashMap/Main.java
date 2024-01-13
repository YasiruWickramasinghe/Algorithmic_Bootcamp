package Data_Structures._6_Hash_Map._2_LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Creating a LinkedHashMap
        Map<String, Integer> studentScores = new LinkedHashMap<>();

        // Adding key-value pairs to the LinkedHashMap
        studentScores.put("Alice", 90);
        studentScores.put("Bob", 85);
        studentScores.put("Charlie", 95);

        // Displaying key-value pairs in the LinkedHashMap
        System.out.println("Student Scores (LinkedHashMap): " + studentScores);
    }
}


