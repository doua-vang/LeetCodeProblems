package easyProblems;
/* 
 * Problem #125
 * 
 * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
 * 
 * Note: For the purpose of this problem, we define empty string as valid palindrome.
 * 
 * Example 1:
 * Input: "A man, a plan, a canal: Panama"
 * Output: true
 * 
 * Example 2:
 * Input: "race a car"
 * Output: false
 * 
 * Results:
 * Runtime: 26 ms, faster than 6.87% of Java online submissions for Valid Palindrome.
 * Memory Usage: 39 MB, less than 33.56% of Java online submissions for Valid Palindrome.
 * 
 * Acceptance Rate: 31.2% as of 6/10/19	
 * 
*/


public class ValidPalindrome {
	public static boolean isPalindrome(String s) {
		if (s.equals("")) return true;
		
		s = s.replaceAll("[^0-9a-zA-Z]","").toLowerCase();
		String res = "";
		
		for (int i = 0; i < s.length(); i ++) {
			
			if (s.charAt(i) != s.charAt(s.length() - 1 - i)) return false;
		}
		
		return true;
	
    }
	public static void main (String args[]) {
		String input = "race a car";
		
		System.out.println("Input: " + input);
		System.out.println("Output: " + ValidPalindrome.isPalindrome(input));
				
		input = "race car";
		
		System.out.println("Input: " + input);
		System.out.println("Output: " + ValidPalindrome.isPalindrome(input));
				
		input = "POWER REWOP";
		
		System.out.println("Input: " + input);
		System.out.println("Output: " + ValidPalindrome.isPalindrome(input));
				
		input = "";
		
		System.out.println("Input: " + input);
		System.out.println("Output: " + ValidPalindrome.isPalindrome(input));
			
		input = " ";
		
		System.out.println("Input: " + input);
		System.out.println("Output: " + ValidPalindrome.isPalindrome(input));
	}
}
