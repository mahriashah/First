package coreJavaTraining;

public class StringClassDemo 
{

	public static void main(String[] args)
	{
		String a= "Java Training";
		
		System.out.println(a);
		
		System.out.println(a.charAt(2));
		System.out.println(a.indexOf("e"));
		// since there was no "e" in the 'String a' 
		//it printed out (-1)
		System.out.println(a.indexOf("T"));
		System.out.println(a.substring(3, 6));
		System.out.println(a.substring(5));
		System.out.println(a.concat(" I love."));
		//concat join string value with mentioned 
		//statement in the concat str
		System.out.println(a.toUpperCase());
		System.out.println(a.toLowerCase());
		
		// Split
	
	String array[]=a.split(" ");
	
	System.out.println(array[0]);
	System.out.println(array[1]);
	System.out.println(a.replace("J", "G"));
		
	}

}
