package coreJavaTraining;

public class NestedLoopsExample {

	public static void main(String[] args) {
	
		for (int i=1; i<=4; i++) // (outer loop)
		{
			System.out.println("Outer Loop Started");
			for (int j=1; j<=4; j++) //(inner loop)
				
			{
				System.out.println("Inner Loop");	
			}
			System.out.println("Outer Loop Ended");
		}
//		
		int k = 1;
		for (int i=0; i<4; i++) // (outer loop)
		{
			
			for (int j=1; j<=4-i; j++) //(inner loop)
				
			{
				System.out.print(k);
				System.out.print("\t");// "\t"=tap creates a space
				k++;
			}
			System.out.println("");
		}
//
//
		int l = 1;
		for (int i=1; i<5; i++) // (outer loop)
		{
			
			for (int j=1; j<=i; j++) //(inner loop)
				
			{
				System.out.print(l);
				System.out.print("\t");
				l++;
			}
			System.out.println("");
		}
		

		for (int i=1; i<=10; i++) // (outer loop)
		{
			
			for (int j=1; j<=i; j++) //(inner loop)
				
			{
				System.out.print(j);
				System.out.print("\t");
			}
			System.out.println("");
		}
		
		int m = 1;
		for (int i=1; i<=4; i++) // (outer loop)
		{
			
			for (int j=1; j<=i; j++) //(inner loop)
				
			{
				System.out.print(m);
				System.out.print("\t");
				m++;
			}
			System.out.println("");
		}
		
		
		
		
		
}
	
}


// for outer loop to achieve 4 times the loop, the inner loop has to run 16 times

