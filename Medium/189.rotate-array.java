/*
 * @lc app=leetcode id=189 lang=java
 *
 * [189] Rotate Array
 */

// @lc code=start

// import java.util.Arrays;

class Solution {
    // simplying rotating array by right shifting
    public void rotateTLE(int[] nums, int k) {
        if (k == 0 || k == nums.length) {
            return;
        }

        for (int i = 0; i < k; i++) {
            // copy last element before shift right by 1
            int temp = nums[nums.length - 1];
            // System.out.printf("temp %d\n", temp);
            for (int j = nums.length - 1; j > 0; j--) {
                nums[j] = nums[j - 1];
            }
            // System.out.println(Arrays.toString(nums));
            nums[0] = temp;
        }
    }
    //

    public void rotate(int[] nums, int k) {
        if (k == 0 || k == nums.length || nums.length == 1) {
            return;
        }

        int len = nums.length;
        // if we have k > len for ex. [1,2] k=3
        k = k % len;
        
        // reverse the last k elements for swapping [1,2,3,5,4]
        int start = len - k;
        int end = len - 1;

        reverse(nums, start, end);

        // reverse the entire array [4,5,3,2,1]
        start = 0;
        end = len - 1;
        reverse(nums, start, end);

        // then reverse from k till len-1 [4,5,1,2,3]
        start = k;
        end = len-1;

        reverse(nums, start, end);
       
    }

    private void reverse(int[] nums, int start, int end){
        while (start <= end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }

    private void swap(int[] nums, int start, int end) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }

}
// @lc code=end
