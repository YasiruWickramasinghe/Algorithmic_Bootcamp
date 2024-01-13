package Data_Structures._6_Hash_Map._3_TreeMap;

import java.util.TreeMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Creating a TreeMap
        Map<String, Integer> studentScores = new TreeMap<>();

        // Adding key-value pairs to the TreeMap with unsorted keys
        studentScores.put("Charlie", 95);
        studentScores.put("Bob", 85);
        studentScores.put("Alice", 90);

        // Displaying key-value pairs in the TreeMap
        //Sorted Manner
        System.out.println("Student Scores (TreeMap): " + studentScores);
    }
}


