
import java.util.*;

/*Write code to reverse a C-Style String. 
(C-String means that “abcd” is represented as  
five characters, including the null character.)*/
public class Reverse {

	public static void reverse(String s) {
		char[] charArray = new char[s.length()];

		for (int i = s.length() - 1; i >= 0; i--) {

			charArray[i] = s.charAt(i);
		}
		System.out.println();

		for (char tmp : charArray) {
			System.out.print(tmp);
		}

	}

	public static String reverseString(String s) {
		char[] charArray = s.toCharArray();
		char temp;
		for (int i = 0; i < s.length() - 1; i++) {
			temp = charArray[i];
			charArray[i] = charArray[s.length() - 1 - i];
			charArray[s.length() - 1 - i] = temp;

		}

		String sReverse = new String(charArray);
		return sReverse;
	}

	public static void main(String[] args) {
		System.out.print(reverseString("Hello"));
	}

}
