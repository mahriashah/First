package coreJavaTraining;

public class dummy {

	public static void main(String[] args) {
		{
			String a= "Ma";
			String b= "";

			for(int i=a.length()-1; i>=0; i--)
			{
				b = b+a.charAt(i);
			}

			System.out.println(a);
			System.out.println(b);

			}

	}

}
