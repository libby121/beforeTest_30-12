
package forTest;

import java.util.Scanner;

public class Tar5 {

	public static void main(String[] args) {
		
		System.out.println("pick a number");

		Scanner sc = new Scanner (System.in);
		int userNum = sc.nextInt();

		for (int i = 1; i <= userNum; i++) {
			for (int j = 1; j <= userNum ; j++) {
			
				if(i==1 || i==userNum || j == 1 || j==userNum ){
				
					System.out.print("X");
			}
				else
					System.out.print(" ");
			}
		System.out.println();
		}





		sc.close();
	}

}
