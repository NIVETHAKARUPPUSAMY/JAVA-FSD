
public class AcsessSpecifier2 {

	public static void main(String[] args) {
		
		System.out.println("Default access specifier");
		defaultspecifier deff=new defaultspecifier();
		deff.display();
		
		System.out.println("Private access specifier");
		privatespecifier priv=new privatespecifier();
		priv.display();
		
		System.out.println("Protected access specifier");
		protectedspecifier proc=new protectedspecifier();
		proc.display();
		
		
		System.out.println("Public access specifier");
		publicspecifier publ=new publicspecifier();
		publ.display();
		
	}
}
class 	defaultspecifier{
	void display()
	{
		System.out.println("In Default access specifier");
	}
}

class 	privatespecifier{
	void display()
	{
		System.out.println("In Private access specifier");
		
	}
}

class 	protectedspecifier{
	void display()
	{
		System.out.println("In Protected access specifier");
		
	}
}

class 	publicspecifier{
	void display()
	{
		System.out.println("In Public access specifier");
	}
}













