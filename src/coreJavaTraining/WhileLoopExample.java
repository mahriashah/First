package coreJavaTraining;

public class WhileLoopExample {

	public static void main(String[] args) {
		
		int i=0;
		// while loop continues until the condition becomes false
		
		while (i<=10)
		{
			System.out.println(i);// - this creates infinite loops
			i++;				  // - by adding this, it becomes false
								  // because at one point it will reach 10
			
		}
		
		while (i>=0)
		{
			System.out.println(i); 
			i--;				 
			
		}
	}

}
