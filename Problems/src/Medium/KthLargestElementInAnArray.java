package Medium;

import java.util.Arrays;

/* 
 * Problem #215
 * 
 * Find the kth largest element in an unsorted array. Note that it is the kth largest element 
 * in the sorted order, not the kth distinct element.
 * 
 * Example 1:
 * Input: [3,2,1,5,6,4] and k = 2
 * Output: 5
 * 
 * Example 2:
 * Input: [3,2,3,1,2,4,5,5,6] and k = 4
 * Output: 4
 * 
 * Note: 
 * You may assume k is always valid, 1 ≤ k ≤ array's length.
 * 
 * Results:
 * Runtime: 56 ms, faster than 5.23% of Java online submissions for Kth Largest Element in an Array.
 * Memory Usage: 37.7 MB, less than 87.26% of Java online submissions for Kth Largest Element in an Array.
 * 
 * Acceptance Rate: 48.0% as of 6/10/19
 *
 */
public class KthLargestElementInAnArray {
	
	//*QuickSort*/
	static int partition(int arr[], int low, int high) 
    { 
        int pivot = arr[high];  
        int i = (low-1); 
        for (int j=low; j<high; j++) 
        { 
            if (arr[j] <= pivot) 
            { 
                i++; 
                
                int temp = arr[i]; 
                arr[i] = arr[j]; 
                arr[j] = temp; 
            } 
        } 
  
        int temp = arr[i+1]; 
        arr[i+1] = arr[high]; 
        arr[high] = temp; 
  
        return i+1; 
    } 
  
    static void sort(int arr[], int low, int high) 
    { 
        if (low < high) 
        { 
            int pi = partition(arr, low, high); 
  
            sort(arr, low, pi-1); 
            sort(arr, pi+1, high); 
        } 
    } 
    
    public static int findKthLargest(int[] nums, int k) {
        sort(nums,0,nums.length -1);
        
        return nums[nums.length - k];
    }
	public static void main(String args []) {
		int[] input = {3,2,1,5,6,4};
		
		System.out.println("Input: " + Arrays.toString(input) + " kth item: 2");
		System.out.println("Output: " + KthLargestElementInAnArray.findKthLargest(input, 2));
		
		System.out.println("Input: " + Arrays.toString(input) + " kth item: 4");
		System.out.println("Output: " + KthLargestElementInAnArray.findKthLargest(input, 4));
		
		
	}
}
