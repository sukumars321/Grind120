/*
 * @lc app=leetcode id=75 lang=java
 *
 * [75] Sort Colors
 */

// @lc code=start
class Solution {
    // simple frequency taking problem
    public void sortColors(int[] nums) {
        int[] freq = new int[3];
        // since we have only 0,1,2, count the freq in a pass
        for (int n : nums) {
            freq[n]++;
        }

        // using the freq sort the given array 
        int index = 0;
        for (int i = 0; i < freq.length; i++) {
            while(freq[i] > 0){
                nums[index++] = i;
                freq[i]--;
            }
        }
    }
    // Learned approach, see https://leetcode.com/problems/sort-colors/solutions/5580767/video-2-solutions-with-frequency-or-3-pointers/
    public void sortColors2(int[] nums) {
       int red =0, white = 0, blue = nums.length -1, temp;

       while(white <= blue){
            if (nums[white] == 0){
                temp = nums[white];
                nums[white] = nums[red];
                nums[red] = temp;
                white++;
                red++;
            } else if (nums[white] == 1) {
                white++;
            } else {
                temp = nums[white];
                nums[white] = nums[blue];
                nums[blue] = temp;
                blue--;
            }
       }
    }


}
// @lc code=end

