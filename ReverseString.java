package oneToFive;

/*Write code to reverse a C-Style String. 
(C-String means that “abcd” is represented as  
five characters, including the null character.)*/
public class Reverse {

	// Using a void return function
	public static void reverse(String s) {
		char[] charArray = new char[s.length()];

		for (int i = s.length() - 1; i >= 0; i--) {

			charArray[s.length() - i - 1] = s.charAt(i);
		}

		for (char tmp : charArray) {
			System.out.print(tmp);
		}
		System.out.println();

	}
	
	// Using only one data structure 
	public static String reverseString1(String s) {
		char[] charArray = s.toCharArray();
		int i = 0;
		int j = s.length() - 1;
		char temp;
		while (i < j) {
			temp = charArray[j];
			charArray[j] = charArray[i];
			charArray[i] = temp;
			i++;
			j--;
		}

		return new String(charArray);
	}

	// Using two data structures
	public static String reverseString(String s) {
		// put the string char to char array
		char[] charArray = s.toCharArray();
		char[] temp = new char[s.length()];

		for (int i = 0; i < s.length(); i++) {
			temp[i] = charArray[s.length() - 1 - i];
			// System.out.print(temp[i]);
		}

		String sReverse = new String(temp);
		return sReverse;
	}

	public static void main(String[] args) {
		reverse("Jamal");
		System.out.println(reverseString("Oliver"));
		System.out.print(reverseString1("Mohammad"));

	}

}
