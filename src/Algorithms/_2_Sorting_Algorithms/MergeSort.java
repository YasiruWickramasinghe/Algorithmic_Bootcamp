package Algorithms._2_Sorting_Algorithms;

public class MergeSort {

    /**
        Description:
        Merge Sort is a divide-and-conquer algorithm that divides the array into two halves,
        recursively sorts them, and then merges the sorted halves.

        Steps:
        1. Divide: Split the array into two halves.
        2. Recursively Sort: Apply Merge Sort to each half.
        3. Merge: Merge the sorted halves into a single sorted array.

        Pseudo Code:
        function mergeSort(arr: list, low: int, high: int)
             n = length(A)

             // check whether array is empty
             if n equals 0
                 print "array is empty"
                 return
             end if

            if low < high
                mid = (low + high) / 2

                // Recursively sort the left and right halves
                mergeSort(arr, low, mid)
                mergeSort(arr, mid + 1, high)

                // Merge the sorted halves
                merge(arr, low, mid, high)
        end function

        function merge(arr: list, low: int, mid: int, high: int)
            // Find sizes of two subarrays to be merged
            n1 = mid - low + 1
            n2 = high - mid

            // Create temporary arrays
            leftArray = new int[n1]
            rightArray = new int[n2]

            // Copy data to temporary arrays
            for i from 0 to n1 - 1
                leftArray[i] = arr[low + i]
            end for
            for j from 0 to n2 - 1
                rightArray[j] = arr[mid + 1 + j]
            end for

            // Merge the temporary arrays back into the main array
            i = 0
            j = 0
            k = low
            while i < n1 and j < n2
                if leftArray[i] <= rightArray[j]
                    arr[k] = leftArray[i]
                    i = i + 1
                else
                    arr[k] = rightArray[j]
                    j = j + 1
                end if
                k = k + 1
            end while

            // Copy the remaining elements of leftArray[], if any
            while i < n1
                arr[k] = leftArray[i]
                i = i + 1
                k = k + 1
            end while

            // Copy the remaining elements of rightArray[], if any
            while j < n2
                arr[k] = rightArray[j]
                j = j + 1
                k = k + 1
            end while
        end function

        // Test
        array = [7, 97 , 4, 11, 10, 51,  3, 75, 2, 7, 48]
        print("Before Sorting Array: ", array)

        mergeSort(array, 0, length(array) - 1)
        print("After Sorting Array: ", array)
    **/

    public static void mergeSort(int[] arr, int low, int high) {
        int n = arr.length;

        // Check whether the array is empty
        if (n == 0) {
            System.out.println("Array is empty. Nothing to sort.");
            return;
        }

        if (low < high) {
            // Find the middle point
            int mid = (low + high) / 2;

            // Recursively sort the left and right halves
            mergeSort(arr, low, mid);
            mergeSort(arr, mid + 1, high);

            // Merge the sorted halves
            merge(arr, low, mid, high);
        }
    }

    private static void merge(int[] arr, int low, int mid, int high) {
        // Find sizes of two subarrays to be merged
        int n1 = mid - low + 1;
        int n2 = high - mid;

        // Create temporary arrays
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        // Copy data to temporary arrays
        System.arraycopy(arr, low, leftArray, 0, n1);
        System.arraycopy(arr, mid + 1, rightArray, 0, n2);

        // Merge the temporary arrays back into the main array
        int i = 0, j = 0, k = low;
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // Copy the remaining elements of leftArray[], if any
        while (i < n1) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }

        // Copy the remaining elements of rightArray[], if any
        while (j < n2) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        int[] arr = {7, 97, 4, 11, 10, 51, 3, 75, 2, 7, 48};

        System.out.println("Before Sorting Array:");
        for (int element : arr) {
            System.out.print(element + ",");
        }
        System.out.println();

        mergeSort(arr, 0, arr.length - 1);

        System.out.println("After Sorting Array:");
        for (int element : arr) {
            System.out.print(element + ",");
        }
    }
}
