package b.loopsAndLables;

public class Demo1 {

	public static void main(String[] args) {
		
		int x = 5;
		
		lbl1:for (int a = 0; a < 10; a++) {
			System.out.println("loop 1");
			System.out.println("loop 1");
			if(x==5) {
				continue;
			}
			System.out.println("loop 1");
			lbl2:for (int b = 0; b < 10; b++) {
				System.out.println("loop 2");
				System.out.println("loop 2");
				if(x==6) {
					break lbl1;
				}
				System.out.println("loop 2");
				lbl3:for (int c = 0; c < 10; c++) {
					System.out.println("loop 3");
					System.out.println("loop 3");
					if(x==6) {
						continue lbl1;
					}
					System.out.println("loop 3");
				}
				System.out.println("loop 2");
				System.out.println("loop 2");
				System.out.println("loop 2");
			}
			System.out.println("break loop 2");
			
			System.out.println("loop 1");
			System.out.println("loop 1");
			System.out.println("loop 1");
		}
		
		System.out.println("break loop 1");

		for (int a = 0; a < 10; a++) {
			for (int b = 0; b < 10; b++) {
				for (int c = 0; c < 10; c++) {
					
				}
			}
		}
		
	}
}
