package Medium;

import java.util.ArrayList;

public class LongestPalindromicSubstring {
	
	public static boolean isPalindrome(String s) {
		if (s.equals("")) return true;
		
		s = s.replaceAll("[^0-9a-zA-Z]","").toLowerCase();
		String res = "";
		
		for (int i = 0; i < s.length(); i ++) {
			
			if (s.charAt(i) != s.charAt(s.length() - 1 - i)) return false;
		}
		
		return true;
	
    }
	public static ArrayList<Integer> getAllOccurances(String s, char c) {
		
		ArrayList<Integer> allPos = new ArrayList<Integer>();
		
		for (int i = 0; i < s.length(); i ++) {
			if (s.charAt(i) == c) {
				allPos.add(i);
			}
		}
		
		return allPos;
	}
	public static String longestPalindrome(String s) {
		ArrayList<Integer> allPos = new ArrayList<Integer>();
		String palindrome = "";
		String alreadySeen = "";
		if (s.length() == 1) return s;
		
		for (int i = 0; i < s.length(); i ++ ) {
			if (alreadySeen.indexOf(s.charAt(i)) == -1) {
				alreadySeen += s.charAt(i); 
				if (s.replace(s.charAt(i) + "", "").equals("")) return s;
				allPos = getAllOccurances(s, s.charAt(i));

				if (allPos.size() > 1) {
					for (int j = 0; j < allPos.size() - 1; j ++) {
						for (int k = j + 1; k < allPos.size(); k ++) {
							if(s.substring(allPos.get(j), allPos.get(k) + 1).length() > palindrome.length()
									&& isPalindrome(s.substring(allPos.get(j), allPos.get(k) + 1))) {
								palindrome = s.substring(allPos.get(j), allPos.get(k) + 1);			
							}
						}
					}
				} else {
					if (s.substring(allPos.get(0),allPos.get(0) + 1).length() > palindrome.length()) {
						palindrome = s.substring(allPos.get(0),allPos.get(0) + 1);
					}
				}
			}
		}
		//System.out.println("ENDING");
		return palindrome;
    }
	 
	 public static void main (String args[]) {
		 String input = "civilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth";
		 //System.out.println(isPalindrome("A"));
		 System.out.println(longestPalindrome(input));
		 
		 input = "babadada";
		 System.out.println(longestPalindrome(input));
		 
		 input = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
		 System.out.println(longestPalindrome(input));
		
		 input = "ffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggg";
		 System.out.println(longestPalindrome(input));
	 }

}
