package coreJavaTraining;

public class ReverseStringDemo {

	public static void main(String[] args) {
	
		String m = "Mahria";
		String d = "";
		
		for(int i=m.length()-1; i>=0; i--)
		{
			d= d+m.charAt(i);
			System.out.println(m.charAt(i));
			
		}
		System.out.println(d);
		
		if (m==d)
		{
			System.out.println("It's Palindrome");
		}
		else 
		{
			System.out.println("It's not Palindrome");
		}
	}

}
