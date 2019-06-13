package easyProblems;

/*
 * Problem #13
 * 
 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
 * Symbol       Value
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 * 
 * For example, two is written as II in Roman numeral, just two one's added together. 
 * Twelve is written as, XII, which is simply X + II. The number twenty seven is 
 * written as XXVII, which is XX + V + II.
 * 
 * Roman numerals are usually written largest to smallest from left to right. However, 
 * the numeral for four is not IIII. Instead, the number four is written as IV. Because 
 * the one is before the five we subtract it making four. The same principle applies to 
 * the number nine, which is written as IX. There are six instances where subtraction is 
 * used:
 * 
 * I can be placed before V (5) and X (10) to make 4 and 9. 
 * X can be placed before L (50) and C (100) to make 40 and 90. 
 * C can be placed before D (500) and M (1000) to make 400 and 900.
 * 
 * Given a roman numeral, convert it to an integer. Input is guaranteed to be within the 
 * range from 1 to 3999.
 * 
 * Example 1:
 * Input: "III"
 * Output: 3
 * 
 * Example 2:
 * Input: "IV"
 * Output: 4
 * 
 * Example 3:
 * Input: "IX"
 * Output: 9
 * 
 * Example 4:
 * Input: "LVIII"
 * Output: 58
 * Explanation: L = 50, V= 5, III = 3.
 * 
 * Example 5:
 * Input: "MCMXCIV"
 * Output: 1994
 * Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
 * 
 *  Results: 
 * Runtime: 10 ms, faster than 38.49% of Java online submissions for Roman to Integer.
 * Memory Usage: 36.6 MB, less than 99.94% of Java online submissions for Roman to Integer.
 * 
 * Acceptance Rate: 52.5% as of 6/10/19
 *
 */

public class RomanToInt {
	
	 public static int romanToInt(String s) {
	        
		 int res = 0 ;
		 
		 for (int i = 0; i < s.length(); i ++) {
			 
			 String currentCharacter = s.charAt(i) + "";
			 String nextCharacter = "";
			 String romanLetter = "";
			 
			 String tens = "VX";
			 String hundreds = "LC";
			 String thousands = "DM";
			 
			 if (i < s.length() - 1) {
				 nextCharacter = s.charAt(i+1) + "";
				 
			 }
			 if (
				 (currentCharacter.equalsIgnoreCase("I") && tens.indexOf(nextCharacter) != -1) ||
				 (currentCharacter.equalsIgnoreCase("X") && hundreds.indexOf(nextCharacter) != -1) ||
				 (currentCharacter.equalsIgnoreCase("C") && thousands.indexOf(nextCharacter) != -1)
				) {
				 romanLetter = currentCharacter + nextCharacter;
				 i ++;
			 }
			 else {
				 romanLetter = currentCharacter;
			 }
			 
			 switch (romanLetter) {
				 case "I": 
					 res += 1;
					 break;
				 case "IV":
					 res += 4;
					 break;
				 case "V":
					 res += 5;
					 break;
				 case "IX":
					 res += 9;
					 break;
				 case "X":
					 res += 10;
					 break;
				 case "XL":
					 res += 40;
					 break;
				 case "L": 
					 res += 50;
					 break;
				 case "XC":
					 res += 90;
					 break;
				 case "C":
					 res += 100;
					 break;
				 case "CD":
					 res += 400;
					 break;
				 case "D":
					 res += 500;
					 break;
				 case "CM":
					 res += 900;
					 break;
				 case "M":
					 res += 1000;
					 break;
				 default:
					 res += 0;
					
			 }
					 
				 
		 }
		 return res;
	 }
	 
	 public static void main(String[] args) {
			String romanLetters = "IV";
			System.out.println("Input Roman Letters: " + romanLetters);
			System.out.println("Output Int: " + RomanToInt.romanToInt(romanLetters));
			
			romanLetters = "MMMMCMXCIX";
			System.out.println("Input Roman Letters: " + romanLetters);
			System.out.println("Output Int: " + RomanToInt.romanToInt(romanLetters));
			
			romanLetters = "MCMLXIX";
			System.out.println("Input Roman Letters: " + romanLetters);
			System.out.println("Output Int: " + RomanToInt.romanToInt(romanLetters));
			
			romanLetters = "DLXXXIX";
			System.out.println("Input Roman Letters: " + romanLetters);
			System.out.println("Output Int: " + RomanToInt.romanToInt(romanLetters));
			
			
		}

}
