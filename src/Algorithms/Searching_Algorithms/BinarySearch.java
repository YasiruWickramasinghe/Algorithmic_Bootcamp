package Algorithms.Searching_Algorithms;

public class BinarySearch {
    //Description:
        //Binary search is an efficient searching algorithm that works on sorted lists. It repeatedly divides the search space in half, reducing the problem size by half with each comparison.

    //Steps:
        //Start with the entire sorted list.
        //Compare the target element with the middle element of the list.
        //If the target element is equal to the middle element, the search is successful, and the index is returned.
        //If the target element is less than the middle element, repeat the search on the left half of the list.
        //If the target element is greater than the middle element, repeat the search on the right half of the list.
        //Repeat these steps until the element is found or the search space is empty, indicating that the element is not present.

    public static void main(String[] args) {
        binarySearch();
    }
    public static void binarySearch(){
        System.out.println("Binary Search");
    }
}


