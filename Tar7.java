package forTest;

import java.util.Scanner;

public class Tar7 {
	public static void main(String[] args) {
		
		System.out.println("pick a number ");
		
		Scanner sc= new Scanner (System.in);
		int userNum = sc.nextInt();
		
		for (int i = 0; i < userNum; i++) {
			for (int j = 1; j <=userNum-i; j++) {//j always starts with 1(according to the drawing)
				System.out.print(j);
				
			}
			System.out.println();
		}
		for (int i = 2; i <= userNum; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print(j);
				
			}
			System.out.println();
		}
		
		
		
		sc.close();
	}

}
