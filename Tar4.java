package forTest;

import java.util.Scanner;

public class Tar4 {
	
	public static void main(String[] args) {
		
		System.out.println("pick a number ");
		
		Scanner sc= new Scanner (System.in);
		int userNum= sc.nextInt();
		
		for(int i=1; i<=userNum ; i++){
			for( int j=1; j<=6 ; j++){
				int x=(int)(Math.random()*38+1);
				System.out.print(x+" ");
			}
		System.out.println();
		}
		
		
		
		
		
		sc.close();
	}

}
