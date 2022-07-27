
public class CONSTRUCTOR {

	CONSTRUCTOR()
	{
		System.out.println("Inside Default constructor");
	}
	CONSTRUCTOR(int b)
	{
		System.out.println("Inside Parameterized constructor");
		
		System.out.println(b);
	
	}

	public static void main(String[] args) {

		CONSTRUCTOR a =new CONSTRUCTOR();
		CONSTRUCTOR b =new CONSTRUCTOR(12);
		
		
	}

}
