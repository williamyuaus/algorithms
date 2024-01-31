class Solution {
    // O(n) time | O(n) space - where n is the length of the input array
    public int[] sortedSquares(int[] nums) {
        int leftPointer = 0;
        int rightPointer = nums.length - 1;
        int[] sortedSquares = new int[nums.length];

        for (int idx = nums.length -1; idx >= 0; idx--) {
             if (Math.abs(nums[leftPointer]) < Math.abs(nums[rightPointer])) {
                sortedSquares[idx] = nums[rightPointer] * nums[rightPointer];
                rightPointer--;
             } else {
                sortedSquares[idx] = nums[leftPointer] * nums[leftPointer];
                leftPointer++;
             }
        }
        return sortedSquares;        
    }
}