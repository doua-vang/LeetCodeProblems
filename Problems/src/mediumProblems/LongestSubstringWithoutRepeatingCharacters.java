package mediumProblems;

public class LongestSubstringWithoutRepeatingCharacters {
	
	public static int lengthOfLongestSubstring(String s) {
		
		int res = 0; 
		
		for (int i = 0; i < s.length(); i ++) {
			String alreadySeen = "";
			int c = 1;
			alreadySeen += s.charAt(i);
			
			//get next occurance of char, send in index of letter with string			
			int nextOccurance = getNextOccurance(s,s.charAt(i), i);
			if (nextOccurance != -1) {
				String subStr = s.substring(i, nextOccurance);
				System.out.println("using substring: " + subStr);
				//check if thre are any dubps in the substring
				if(!hasDups(subStr)) {
					if (subStr.length() > res) {
						res = subStr.length();
					}
				}
			}
			
			//store count
		}
		
        return res;
    }
	
	public static int getNextOccurance (String s, char c, int index) {
		
		for (int i = index + 1; i < s.length(); i ++) {
			if (s.charAt(i) == c) {
				return i;
			}
		}
		return -1;
	}

	
	public static boolean hasDups (String s) {
		String alreadySeen = "";
		
		for (int i = 0; i < s.length(); i ++) {
			if (alreadySeen.indexOf(s.charAt(i) + "") != -1) {
				return true;
			} else {
				alreadySeen += s.charAt(i);
			}
		}
		
		return false;
	}
	
	public static void main (String args []) {
		String input = "cdd";
		
		System.out.println("input: " + input);
		System.out.println("output: " + lengthOfLongestSubstring(input));
		
		input = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		//System.out.println("input: " + input);
		//System.out.println("output: " + lengthOfLongestSubstring(input));

	}
}
