package forTest;

import java.util.Arrays;

public class Tar6 {

	public static void main(String[] args) {

		char[] nameChars = { 'l', 'i', 'b', 'b', 'y',' ', 'O', 'v', 'a','d','i','a' };// original letters array
		System.out.println(Arrays.toString(nameChars));

		char[] mixedChar = new char[nameChars.length];//resulted array- after letters mixing. the printimg 
								//will be for each letter separately

		int random = 0;
		int i = 0;
		int j = 0;
		int[] emptyOrNot = new int[nameChars.length];//creating a special array for checking if an index is empty

		for (i = 0; i < nameChars.length; i++) {// at the end of the loop 
			/				//each original letter will change its original position

			do {// first time randomization is required pre- checking
				random = (int) (Math.random() * (nameChars.length));
				// System.out.println("random  num " + random);

			} while (emptyOrNot[random] == 1);//as long as the index is already full-keep randomizing for another letter

			emptyOrNot[random] = 1;//after a legitimate random num has finaly arrived- signal it for the next iterations
			mixedChar[random] = nameChars[i];//new array is filled at the randomized index
							//with the original array value(at the current iteration)

		}

		for (j = 0; j < mixedChar.length; j++) {//print each letter separately

			System.out.print(mixedChar[j]);
		}
	}

}
