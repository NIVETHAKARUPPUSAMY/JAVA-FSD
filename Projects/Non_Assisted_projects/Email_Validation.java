package Non_Assisted_projects;

import java.util.regex.*;    
import java.util.*;    

public class Email_Validation {
	
	    public static void main(String args[]){  
	        ArrayList<String> email = new ArrayList<String>();  
	        email.add("aaaa@gmail.com");
	        email.add("bbbb@gmail.com");
	        email.add("cccc@gmail.com");
	        email.add("dddd@gmail.com");
	        email.add("eeee@gmail.com");
	        email.add("fffff@gmail.com");
	        email.add("gggga@gmail.com");
	        
	        //Add invalid emails in list  
	        
	        email.add("@yahoo.com");  
	        email.add("aaaa#.com");  
	        email.add("gmail.com"); 
	        email.add("aaaa gmail.com"); 
	        
	        //Regular Expression   
	        String regex = "^(.+)@(.+)$";  
	        
	        //Compile regular expression to get the pattern  
	        Pattern pattern = Pattern.compile(regex); 
	        
	        //Iterate emails array list  
	        for(String emails : email){  
	            //Create instance of matcher   
	            Matcher matcher = pattern.matcher(emails);  
	            System.out.println(emails +" : "+ matcher.matches());  
	        }  
	    }  
}  


