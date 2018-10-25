package coreJavaTraining;

public class FirstClass {
	
	//variables
	int a = 5;
	//Methods
	public void getData()
	{
	System.out.println("I am in First Class Method");
	//return "hello";
	}
	
	public static void main(String[] args) {
		
		FirstClass fc = new FirstClass(); 
		// by creating space within Java, i can access any methods within FirstClass 
		// and out of Public Void Main
		SecondClass sc = new SecondClass();
		// by creating space within Java, i can access any methods within SecondClass 
		// and out of Public Void Main
		
		fc.getData();
		sc.setData();
		
		System.out.print("hey ");
		System.out.println("hi");
		System.out.println("hello");
		
		System.out.println(fc.a);
		
		
	}

}
