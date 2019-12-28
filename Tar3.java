package forTest;

import java.util.Scanner;

public class Tar3 {


	public static void main(String[] args) {

		int num = (int)(Math.random()*6+25);
		System.out.println("let's go! can you guess my number? ");
		System.out.println("hidden num "+num);
		Scanner sc = new Scanner (System.in);


		
		
int i;
		for( i=1; i<=3 ; i++){
			int userGuess= sc.nextInt();
			if (userGuess== num){
				System.out.println("you did it !");
			}
			else if (i!=3) System.out.println("try again ");	

		}
		
		if(i>3){
			System.out.println("you were so close!");
		}
		System.out.println("Game over. thank's for playing :))");
		sc.close();		
	}




}




