package Practise_Projects;

public class Constructor {

	Constructor()
	{
		System.out.println("Inside Default constructor");
	}
	Constructor(int b)
	{
		System.out.println("Inside Parameterized constructor");
		
		System.out.println(b);
	
	}

	public static void main(String[] args) {

		Constructor a =new Constructor();
		Constructor b =new Constructor(12);
		
		
	}

}