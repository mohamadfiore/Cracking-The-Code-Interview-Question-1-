package oneToFive;

import java.util.*;

/*Write code to reverse a C-Style String. 
(C-String means that “abcd” is represented as  
five characters, including the null character.)*/
public class Reverse {

	//Using a void function
	public static void reverse(String s) {
		char[] charArray = new char[s.length()];

		for (int i = s.length() - 1; i >= 0; i--) {

			charArray[s.length()-i-1] = s.charAt(i);
		}

		for (char tmp : charArray) {
			System.out.print(tmp);
		}
		System.out.println();

	}

	// Using two data structures
	public static String reverseString(String s) {
		// put the string char to char array
		char[] charArray = s.toCharArray();
		char[] temp = new char[s.length()];

		for (int i = 0; i < s.length(); i++) {
			temp[i] = charArray[s.length() - 1 - i];
			System.out.print(temp[i]);
		}

		String sReverse = new String(temp);
		return sReverse;
	}

	public static void main(String[] args) {
		reverse("Test Example1");
		reverseString("Hello");

	}

}
