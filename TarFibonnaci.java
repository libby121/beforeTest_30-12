package pre_TEST2;

public class TarFibonnaci {

	/*
	 * Fibonacci set is an array of numbers. Each number is the sum value of the
	 * two previous numbers. The first number is 1
	 * 
	 * [1,1,2,3,5,8,13,21,34,55,89…]
	 * 
	 * Create a class that defines a random number named “index” with a value
	 * between 0-50 and prints the number in Fibonacci set that is located in
	 * the “index” position
	 */

	public static void main(String[] args) {

		int index = (int) (Math.random() * 6 + 1);

		System.out.println("the index \t" + index);

		int a = 1, b = 1;
		int k = 0;
		// System.out.println(a +" "+"\n"+ b );

		for (int i = 0; i <= index; i++) {

			a = k;
			k = a + b;
			// System.out.println(k);

			b = a;

		}

		System.out.println(k);

	}

}
