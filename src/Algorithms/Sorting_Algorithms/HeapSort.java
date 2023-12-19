package Algorithms.Sorting_Algorithms;

public class HeapSort {

    /**
        Description:
        Heap Sort is a comparison-based sorting algorithm that uses a binary heap data structure
        to build a max-heap or min-heap and perform sorting.

        Steps:
        1. Build Heap: Build a max-heap (for ascending order) or min-heap (for descending order)
           from the given array.
        2. Extract Elements: Repeatedly extract the maximum (for max-heap) or minimum (for min-heap)
           element from the heap and maintain the heap property.

        Pseudo Code:
        function heapSort(arr: list)
             n = length(A)

             // check whether array is empty
             if n equals 0
                print "array is empty"
                return
             end if

            // Build a max-heap from the array
            buildMaxHeap(arr)

            // Extract elements from the heap one by one
            for i from length(arr) - 1 to 0
                swap(arr[0], arr[i])  // Move the root (max element) to the end
                maxHeapify(arr, 0, i)  // Maintain max-heap property
        end function

        function buildMaxHeap(arr: list)
            n = length(arr)

            // Build a max-heap starting from the last non-leaf node
            for i from n/2 - 1 to 0
                maxHeapify(arr, i, n)
        end function

        function maxHeapify(arr: list, i: int, heapSize: int)
            largest = i
            leftChild = 2 * i + 1
            rightChild = 2 * i + 2

            if leftChild < heapSize and arr[leftChild] > arr[largest]
                largest = leftChild

            if rightChild < heapSize and arr[rightChild] > arr[largest]
                largest = rightChild

            if largest != i
                swap(arr[i], arr[largest])
                maxHeapify(arr, largest, heapSize)
        end function

        // Test
        array = [7, 97, 4, 11, 10, 51, 3, 75, 2, 7, 48]
        print("Before Sorting Array: ", array)

        heapSort(array)
        print("After Sorting Array: ", array)
    **/

    public static void heapSort(int[] arr) {
        int n = arr.length;

        // Check whether the array is empty
        if (n == 0) {
            System.out.println("Array is empty. Nothing to sort.");
            return;
        }

        // Build a max-heap from the array
        buildMaxHeap(arr);

        // Extract elements from the heap one by one
        for (int i = n - 1; i > 0; i--) {
            // Move the root (max element) to the end
            swap(arr, 0, i);

            // Maintain max-heap property
            maxHeapify(arr, 0, i);
        }
    }

    private static void buildMaxHeap(int[] arr) {
        int n = arr.length;

        // Build a max-heap starting from the last non-leaf node
        for (int i = n / 2 - 1; i >= 0; i--) {
            maxHeapify(arr, i, n);
        }
    }

    private static void maxHeapify(int[] arr, int i, int heapSize) {
        int largest = i;
        int leftChild = 2 * i + 1;
        int rightChild = 2 * i + 2;

        if (leftChild < heapSize && arr[leftChild] > arr[largest]) {
            largest = leftChild;
        }

        if (rightChild < heapSize && arr[rightChild] > arr[largest]) {
            largest = rightChild;
        }

        if (largest != i) {
            swap(arr, i, largest);
            maxHeapify(arr, largest, heapSize);
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {7, 97, 4, 11, 10, 51, 3, 75, 2, 7, 48};

        System.out.println("Before Sorting Array:");
        for (int element : arr) {
            System.out.print(element + ",");
        }
        System.out.println();

        heapSort(arr);

        System.out.println("After Sorting Array:");
        for (int element : arr) {
            System.out.print(element + ",");
        }
    }
}

