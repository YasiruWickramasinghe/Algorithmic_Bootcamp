package Algorithms._1_Searching_Algorithms._2_BinarySearch._3_LeetCode.Kunal._11_Split_Array_Largest_Sum;

public class Main {
    public static void main(String[] args) {
        int[] nums = {7, 2, 5, 8, 10};
        int m = 2;
        int ans = spitArray(nums, m);

        System.out.println("minimize sum is: " + ans);
    }

    public static int spitArray(int[] nums, int m){
        int start = 0;
        int end = 0;

        for (int i = 0; i < nums.length; i++) {
            start = Math.max(start, nums[i]); //in the end of the loop this will contain the max item from the array
            end += nums[i];
        }

        //binary search
        while (start < end){
            // try for the middle as the potential answer
            int mid = start + (end - start) / 2;

            //calculate how many pieces you can divide this in with this max sum
            int sum = 0;
            int pieces = 1;

            for (int num : nums) {
                if(sum + num > mid){
                    //you cannot add this subarray, make new
                    //say you add this num in new subarray, then sum = num
                    sum = num;
                    pieces++;
                }else {
                    sum += num;
                }
            }

            if(pieces > m){
                start = mid + 1;
            }else {
                end = mid;
            }
        }
        return end; //here start == end
    }
}
