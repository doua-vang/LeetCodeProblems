package mediumProblems;

/* 
 * Problem #151
 * Given an input string, reverse the string word by word.
 * 
 * Example 1:
 * Input: "the sky is blue"
 * Output: "blue is sky the"
 * 
 * Example 2:
 * Input: "  hello world!  "
 * Output: "world! hello"
 * Explanation: Your reversed string should not contain leading or trailing spaces.
 * 
 * Example 3:
 * Input: "a good   example"
 * Output: "example good a"
 * Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.
 * 
 * Note:
 * A word is defined as a sequence of non-space characters.
 * Input string may contain leading or trailing spaces. However, your reversed string should not contain leading or trailing spaces.
 * You need to reduce multiple spaces between two words to a single space in the reversed string.
 * 
 * Results: 
 * Runtime: 12 ms, faster than 22.40% of Java online submissions for Reverse Words in a String.
 * Memory Usage: 38.9 MB, less than 55.41% of Java online submissions for Reverse Words in a String.
 *
 * Acceptance Rate: 16.8% as of 6/10/19
 *
 */

public class ReverseWordsInAString {
	
	public static String reverseWords(String s) {
		if (s.equalsIgnoreCase("") || s.equalsIgnoreCase(" ") || s.length() == 0) {
            return "";
        }
        
        String []  res = s.split(" ");
		String retString = "";
        if (res.length == 0) {
            return ""; 
            
        }
       
		for (int i = 0; i < res.length - 1; i ++) {
			if (!res[i].equalsIgnoreCase("")) {
				retString =  " " + res[i] + retString ;
			}
		}
        
		return res[res.length - 1] + retString;
        
    }
	
	public static void main(String[] args) {
		String input = "the sky is blue";
		System.out.println("Input: ->" + input + "<-");
		System.out.println("Output: ->" + ReverseWordsInAString.reverseWords(input) + "<-");
		
		input = "a";
		System.out.println("Input: ->" + input + "<-");
		System.out.println("Output: ->" + ReverseWordsInAString.reverseWords(input) + "<-");
		
		input = "a good   example";
		System.out.println("Input: ->" + input + "<-");
		System.out.println("Output: ->" + ReverseWordsInAString.reverseWords(input) + "<-");
		
		input = "The Brown Fox Hope Over The Fenece";
		System.out.println("Input: ->" + input + "<-");
		System.out.println("Output: ->" + ReverseWordsInAString.reverseWords(input) + "<-");
		
		input = "  hello world!  ";
		System.out.println("Input: ->" + input + "<-");
		System.out.println("Output: ->" + ReverseWordsInAString.reverseWords(input) + "<-");
	
	}

}
