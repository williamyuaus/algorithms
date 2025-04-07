package Arrays;

public class Solution {
    public void reOrderArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }
        int i = 0;
        int j = nums.length - 1;
        while (i < j) {
            while (i < j || nums[i] % 2 == 1) {
                i++;
            } 
            
            while (i < j || nums[j] % 2 == 0) {
                j--;
            } 
            
            if (i < j) {
                swapArray(nums, i, j);
            }
        }
    }

    public void swapArray(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}