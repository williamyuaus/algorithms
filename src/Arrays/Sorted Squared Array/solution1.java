
import java.util.*;

class Solution {
    
    // O(nlogn) time | O(n) space - where n is the length of the input array
    public int[] sortedSquares(int[] nums) {
        int[] sortedSquares = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int value = nums[i];
            sortedSquares[i] = value * value;
        }

        Arrays.sort(sortedSquares);
        return sortedSquares;

    }
}