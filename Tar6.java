package forTest;

import java.util.Arrays;

public class Tar6 {

	public static void main(String[] args) {

		char[] nameChars = { 'l', 'o', 'b', ' ' };
		System.out.println(Arrays.toString(nameChars));
		
		char [] mixedChar= new char [nameChars .length];sccccp[]
		
		int count = 0;
		int i = 0;

		while (i < nameChars.length) {
			count = (int) (Math.random() * (nameChars.length));
			// System.out.println(count);
			int j;
			for (j = 0; j < mixedChar.length; j++) {
				if (i == count)
					break;
			

			if (j == nameChars.length) {
				 {
					nameChars[count]=nameChars[i];
					i++;

				}

			}
		}
		System.out.print(Arrays.toString(nameChars));
	}

}
