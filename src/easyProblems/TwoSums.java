package easyProblems;

import java.util.Arrays;

/*
 * Problem #1
 * 
 * Given an array of integers, return indices of the two numbers 
 * such that they add up to a specific target.
 * 
 * You may assume that each input would have exactly one solution, 
 * and you may not use the same element twice.
 * 
 * Example:
 * Given nums = [2, 7, 11, 15], target = 9,
 * 
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 * 
 * Results:
 * Runtime: 93 ms, faster than 5.39% of Java online submissions for Two Sum.
 * Memory Usage: 36.2 MB, less than 99.82% of Java online submissions for Two Sum.
 * 
 * Acceptance Rate: 44.2% as of 6/10/19
 *
 */
public class TwoSums {
	public static int[] twoSum(int[] nums, int target) {
        int i1 = 0; 
        int i2 = 0;
        
        int [] res = new int [2];
        
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 1; j < nums.length; j ++) {
                if (i != j) {
                    if (nums[i] + nums[j] == target) {
                        i1 = i;
                        i2 = j;
                    }
                }
            }
        }
        if (i1 > i2) {
            res[0] = i2;
            res[1] = i1;
        }
        else {
            res[0] = i1;
            res[1] = i2;
        }
        return res;
    }
	public static void main(String[] args) {
		
		int [] nums = {2,7,11,15};
		int target = 9;
		int [] res = TwoSums.twoSum(nums, target);
		
		System.out.println("Given: " + Arrays.toString(nums) + " target sum: " + target);
		System.out.print("Output: " + Arrays.toString(res));
	}
}
