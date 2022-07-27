package Practise_Projects;

import java.util.regex.*;

public class Regular_Expression {
	
	public static void main(String[] args) {

		String pattern = "[a-z]+";
		String check = "Good Morning Everyone Welcome To Java";
		Pattern p = Pattern.compile(pattern);
		Matcher c = p.matcher(check);
		
		while (c.find())
	      	System.out.println( check.substring( c.start(), c.end() ) );
		}

}
