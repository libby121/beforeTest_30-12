package forTest;

import java.util.Arrays;

public class Tar1pre {

	public static void main(String[] args) {

		int[] randomNums = new int[5];

		int i = 0;
		
		while (i < randomNums.length) {
			int x = (int) (Math.random() * 10 + 1);
			int j = 0;
			for (j = 0; j < randomNums.length; j++) {//j<i
				if (x == randomNums[j])
					break;

			}
			if (j == randomNums.length) {//how can i ask about the min here? first index is not yet initialized
				randomNums[i] = x;

				i++;
			}

		}
		System.out.println(Arrays.toString(randomNums));

		int max = 0;
		int min = randomNums[0];
		double avg = 0;
		for (int k = 0; k < randomNums.length; k++) {
			if (randomNums[k] > max)
				max = randomNums[k];
			else if (randomNums[k] < min)
				min = randomNums[k];
			avg += randomNums[k];
		}
		System.out.println("max: " + max + " min: " + min + " avg: " + avg
				/ randomNums.length);
	}


}
