package Easy;

/* 
 * Problem #196
 * The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci 
 * sequence, such that each number is the sum of the two preceding ones, starting 
 * from 0 and 1. That is,
 *
 * F(0) = 0,   F(1) = 1
 * F(N) = F(N - 1) + F(N - 2), for N > 1.
 * 
 * Given N, calculate F(N).
 * 
 * Example 1
 * Input: 2
 * Output: 1
 * Explanation: F(2) = F(1) + F(0) = 1 + 0 = 1.
 * 
 * Example 2:
 * Input: 3
 * Output: 2
 * Explanation: F(3) = F(2) + F(1) = 1 + 1 = 2.
 * 
 * Example 3:
 * Input: 4
 * Output: 3
 * Explanation: F(4) = F(3) + F(2) = 2 + 1 = 3.
 * 
 * Note:
 * 0 ≤ N ≤ 30.
 * 
 * Results:
 * Runtime: 9 ms, faster than 29.06% of Java online submissions for Fibonacci Number.
 * Memory Usage: 32.9 MB, less than 48.47% of Java online submissions for Fibonacci Number.
 * 
 * Acceptance Rate: 66.7% as of 6/10/19
 *
 */

public class FibonacciNumber {
	public static int fib(int N) {
        if (N <= 0) 
        	return 0;
       if (N == 1) 
    	   return 1;
       return fib(N - 1) + fib (N - 2);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num  = 14;
		
		System.out.println("input: " + num);
		System.out.println("output: " + FibonacciNumber.fib(num));

	}
}
