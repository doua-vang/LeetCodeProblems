package easyProblems;

/*
 * Problem #709
 * 
 * Implement function ToLowerCase() that has a string parameter str, and returns the same string in lowercase.
 * 
 * Example 1:
 * Input: "Hello"
 * Output: "hello"
 * 
 * Example 2:
 * Input: "here"
 * Output: "here"
 * 
 * Example 3:
 * Input: "LOVELY"
 * Output: "lovely"
 * 
 * Results:
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for To Lower Case.
 * Memory Usage: 34.1 MB, less than 99.91% of Java online submissions for To Lower Case.
 * 
 * Acceptance Rate: 76.9% as of 6/10/19
 *
 */
public class ToLowerCase {

	public static String toLowerCase(String str) {
        String res = "";
        String character = "";
        
        for (int i = 0; i < str.length(); i ++) {
            character = str.charAt(i) + "";
            
            switch(character) {
                case "A":
                    res = res + "a";
                    break;
                case "B":
                    res = res + "b";
                    break;
                case "C":
                    res = res + "c";
                    break;
                case "D":
                    res = res + "d";
                    break;
                case "E":
                    res = res + "e";
                    break;
                case "F":
                    res = res + "f";
                    break;
                case "G":
                    res = res + "g";
                    break;
                case "H":
                    res = res + "h";
                    break;
                case "I":
                    res = res + "i";
                    break;
                case "J":
                    res = res + "j";
                    break;
                case "K":
                    res = res + "k";
                    break;
                case "L":
                    res = res + "l";
                    break;
                case "M":
                    res = res + "m";
                    break;
                case "N":
                    res = res + "n";
                    break;
                case "O":
                    res = res + "o";
                    break;
                case "P":
                    res = res+ "p";
                    break;
                case "Q":
                    res = res + "q";
                    break;
                case "R":
                    res = res + "r";
                    break;
                case "S":
                    res = res + "s";
                    break;
                case "T":
                    res = res + "t";
                    break;
                case "U":
                    res = res + "u";
                    break;
                case "V":
                    res = res + "v";
                    break;
                case "W":
                    res = res + "w";
                    break;
                case "X":
                    res = res + "x";
                    break;
                case "Y":
                    res = res + "y";
                    break;
                case "Z":
                    res = res + "z";
                    break;
                default:
                    res = res + character;
                    break;
            }
        }
        return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "HERLEJdfdsfijeWIEJ";
		
		System.out.println("input: " + str);
		System.out.println("output: " + ToLowerCase.toLowerCase(str));
		
		str = "The Brown Fox Jump Over the Rainbow";
		
		System.out.println("input: " + str);
		System.out.println("output: " + ToLowerCase.toLowerCase(str));
		
		str = "Hello WOrld!!! How are you?";
		
		System.out.println("input: " + str);
		System.out.println("output: " + ToLowerCase.toLowerCase(str));

	}
}
