package Practise_Projects;

public class InnerClass {
	
	class Inner
	{
		void innercl()
		{
		System.out.println("Inside inner class");
		}
	}

	public static void main(String[] args) {

		InnerClass i=new InnerClass();
		InnerClass.Inner in=i.new Inner();
		in.innercl();
	}

}
