package forTest;

import java.util.Arrays;

public class Tar6 {

	public static void main(String[] args) {

		char[] nameChars = { 'l', 'i', 'b', 'b', 'y',' ', 'O', 'v', 'a','d','i','a' };
		System.out.println(Arrays.toString(nameChars));

		char[] mixedChar = new char[nameChars.length];

		int random = 0;
		int i = 0;
		int j = 0;
		int[] emptyOrNot = new int[nameChars.length];

		for (i = 0; i < nameChars.length; i++) {

			do {
				random = (int) (Math.random() * (nameChars.length));
				// System.out.println("random  num " + random);

			} while (emptyOrNot[random] == 1);

			emptyOrNot[random] = 1;
			mixedChar[random] = nameChars[i];

		}

		for (j = 0; j < mixedChar.length; j++) {

			System.out.print(mixedChar[j]);
		}
	}

}
