
public class typecastingchallenge {

	public static void main(String[] args) {
		
		//Explicit conversion
		
		//Method 1
		
		String input="12.5";
		System.out.println("string input : "+ input);
		
		//converting string to double
		double mydouble=Double.parseDouble(input);
		System.out.println("Double value : "+mydouble );
		
		// Method 2
		
		//converting double to int 
		
		double a=15.7;
		int b=(int)a;
		System.out.println("Double value : " +a);
		System.out.println("Int value : "+b);

		//implicit conversion
		char c='a';
		System.out.println("Char value : "+c);
		
		int d=c;
		System.out.println("int value : "+d);
		
		float e=c;
		System.out.println("float value : "+e);
		
		double f=c;
		System.out.println("double value : "+f);
		
		long g=c;
		System.out.println("long value : "+g);
		
	}

}
