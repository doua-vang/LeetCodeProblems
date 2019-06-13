package Easy;

/* 
 * Problem #69
 * 
 * Implement int sqrt(int x).
 * 
 * Compute and return the square root of x, where x is guaranteed to be a non-negative integer.
 * 
 * Since the return type is an integer, the decimal digits are truncated and only the integer part of the result is returned.
 * 
 * Example 1:
 * Input: 4
 * Output: 2
 * 
 * Example 2:
 * Input: 8
 * Output: 2
 * 
 * Explanation: 
 * The square root of 8 is 2.82842..., and since the decimal part is truncated, 2 is returned.
 *
 * Results: 
 * Runtime: 11 ms, faster than 35.80% of Java online submissions for Sqrt(x).
 * Memory Usage: 33.5 MB, less than 44.10% of Java online submissions for Sqrt(x).
 *
 * Acceptance Rate: 31.4% as of 6/10/19
 *
 */
public class Sqrt {
	public static int mySqrt(int x) {
	    long ret = 0;

        while (ret * ret <= x) {
            ret ++;
        }

        return (int) ret - 1;
    }
	
	public static void main(String[] args) {
		int input = 2147483647;
		for (int i = 0; i < 81; i ++) {
			System.out.println("Input: " + i);
			System.out.println("Output: " + Sqrt.mySqrt(i));
		}

	}
}
