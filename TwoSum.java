// LeetCode Problem:
// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
// You may assume that each input would have exactly one solution, and you may not use the same element twice.

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // create an array to add the two indices so that they can be returned.
        int[] twoSumArray = new int[2];
        // nested loop to iterate through each element and compare it to all other elements in the array to find the solution.
        for (int i = 0; i < nums.length - 1; i++) {
            // this loop iterates through all other elements other than the one that is being compared and previous comparisons
            for (int j = i + 1; j < nums.length; j++){
                // checks if current elements are equal to the target since there is only one situation and if so appends them to the array created above
                if (nums[i] + nums[j] == target) {
                    twoSumArray[0] = i;
                    twoSumArray[1] = j;
                }
            }
        }
        return twoSumArray;
    }
}

// Notes: I had it wrong for a little while because I was accidentally incrementing i a second time in my nested for loop instead of incrementing j.
