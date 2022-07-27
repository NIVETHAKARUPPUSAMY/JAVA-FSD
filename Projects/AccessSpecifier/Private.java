package AccessSpecifier;

public class Private
{
	public static void main(String[] args) {

		System.out.println("Private access specifier");
		PrivateDisplay priv=new PrivateDisplay();
		priv.display();
		
	}
}

class 	PrivateDisplay
{
	void display()
	{
		System.out.println("In Private access specifier");
		
	}
}

