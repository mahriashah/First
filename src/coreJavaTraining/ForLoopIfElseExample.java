package coreJavaTraining;

public class ForLoopIfElseExample {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
	
	//if there are only 1 statement, if/else arguments can be 
	// written without {braces}, must include {braces} if there
	// are more then 1 statement.
	
	if (5>2)
	System.out.println("Success");
	else 
	System.out.println("Fail");	
	
	for (int i=0; i<=10; i=i+1)
	{
		if (i==10 ) 
		{
			System.out.println("10 is displayed");
		}
		else
			{
			System.out.println("I did not find");
			}
	}
	
	
	
	}

}
