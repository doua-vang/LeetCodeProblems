package easyProblems;
/*
 * Problem #7
 * 
 * Given a 32-bit signed integer, reverse digits of an integer.
 * Example 1:
 * Input: 123
 * Output: 321
 * Example 2:
 * 
 * Input: -123
 * Output: -321
 * 
 * Example 3:
 * Input: 120
 * Output: 21
 * 
 * Note:
 * Assume we are dealing with an environment which could only store integers within the 
 * 32-bit signed integer range: [−231,  231 − 1]. For the purpose of this problem, assume 
 * that your function returns 0 when the reversed integer overflows.
 * 
 * Results:
 * Runtime: 1 ms, faster than 100.00% of Java online submissions for Reverse Integer.
 * Memory Usage: 33.5 MB, less than 53.97% of Java online submissions for Reverse Integer.
 *
 * Acceptance Rate: 25.3% as of 6/10/19
 *
 */

public class ReverseInteger {
	public static int reverse(int x) {
        if (x >= Integer.MAX_VALUE - 1 || x <= Integer.MIN_VALUE) {
            return 0; 
        }
        
        int res = 0;

        int y = (x < 0) ? x * -1 : x ;
        
        while (y != 0) {
            if(res > Integer.MAX_VALUE/10){
                return 0;
            }
            res = (res * 10) + (y % 10);
            y = y / 10;

        }
        
        res = (x < 0) ? res * -1 : res ;
        
        return res;
        
    }
	
	public static void main(String[] args) {
		int x = 321; 
	
		System.out.println("Input: " + x);
		System.out.println("Output: " + ReverseInteger.reverse(x));
		System.out.println("");
			
		x = 342423424; 
		
		System.out.println("Input: " + x);
		System.out.println("Output: " + ReverseInteger.reverse(x));
		System.out.println("");
		
		x = -44744545; 
		
		System.out.println("Input: " + x);
		System.out.println("Output: " + ReverseInteger.reverse(x));
		System.out.println("");

	}
}
