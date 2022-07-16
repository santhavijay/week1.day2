package week1.day2;

public class Charcount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String myWord = "signalsandsystems";
		char toFind = 's';
		int count = 0;
//convert string into character array
		char[] individualChar = myWord.toCharArray();
		for (int i = 0; i < individualChar.length; i++) {
			// compare char 's' with individual char present in the given string
			if (toFind == individualChar[i]) {
				count++;
			}
		}
		System.out.println("Number of 's' present in " + myWord + "is" + " " + count);
	}

}
