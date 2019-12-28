package forTest;

import java.util.Arrays;

public class Tar2 {
	
	public static void main(String[] args) {
		
		int [] numbers = new int [10];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i]=(int)(Math.random()*5+1);
		}
		
		System.out.println(Arrays.toString(numbers));
		
		for(int i=1; i<=5 ; i++){
			int count=0;
			for (int j = 0; j < numbers.length; j++) {
				if(numbers[j]==i){
					count++;
				}
				
			}
			System.out.println( i + " was found "+ count +" times in my array");
		}
		
	}

}
