

public class INNERCLASS {
	class Inner
	{
		void innercl()
		{
		System.out.println("Inside inner class");
		}
	}

	public static void main(String[] args) {

		INNERCLASS i=new INNERCLASS();
		INNERCLASS.Inner in=i.new Inner();
		in.innercl();
	}

}
