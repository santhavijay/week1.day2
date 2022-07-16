package week1.day2;

public class Stringrev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//get a string
		String word = "Hello";
		// convert the string to character array
		char[] c = word.toCharArray();
		// find number of characters in a character array
		int wordLength = c.length;
		// print string in reverse order
		for (int i = wordLength - 1; i >= 0; i--) {
			System.out.print(c[i]);
		}

	}

}
