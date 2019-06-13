package Easy;

/*
 * Problem #204
 * 
 * Count the number of prime numbers less than a non-negative number, n.
 * 
 * Example:
 * Input: 10
 * Output: 4
 * 
 * Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.
 *
 * Results:
 * Runtime: 288 ms, faster than 16.20% of Java online submissions for Count Primes.
 * Memory Usage: 32.9 MB, less than 86.83% of Java online submissions for Count Primes.
 * 
 * Acceptance Rate: 29.1% as of 6/10/19
 *
 */
public class CountPrimes {
	public static int countPrimes(int n) {
	    int numOfPrime = 0;
        for (int i = 2; i < n; i ++) {
        	if (isPrime(i)) {
        		numOfPrime ++;
        	}
        }
        return numOfPrime;
    }
	public static boolean isPrime(int n) {
		if (n < 2) return false;
		if (n == 2) return true;
		if (n % 2 == 0) return false;
		for (int i = 3; i * i <= n; i = i + 2 ) { 
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String args []) {
		int input = 10;
		
		System.out.println("Input: " + input);
		System.out.println("Output: " + CountPrimes.countPrimes(input));
		
		input = 0;
		
		System.out.println("Input: " + input);
		System.out.println("Output: " + CountPrimes.countPrimes(input));
		
		input = 1;
		
		System.out.println("Input: " + input);
		System.out.println("Output: " + CountPrimes.countPrimes(input));
		
		input = 3;
		
		System.out.println("Input: " + input);
		System.out.println("Output: " + CountPrimes.countPrimes(input));
		
		input = 2;
		
		System.out.println("Input: " + input);
		System.out.println("Output: " + CountPrimes.countPrimes(input));
		
		input = 11;
		
		System.out.println("Input: " + input);
		System.out.println("Output: " + CountPrimes.countPrimes(input));
	}
}
