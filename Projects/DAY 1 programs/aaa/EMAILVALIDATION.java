import java.util.*;

public class EMAILVALIDATION {
public static void main(String[] args)
{
        
        ArrayList<String> emailID = new ArrayList<String>();
        
        emailID.add("aaaa@gmail.com");
        emailID.add("bbbb@gmail.com");
        emailID.add("cccc@gmail.com");
        emailID.add("dddd@gmail.com");
        emailID.add("eeee@gmail.com");
        emailID.add("fffff@gmail.com");
        emailID.add("gggga@gmail.com");
        
      String strc="dddd@gmail.com";
        for(int i=0; i<emailID.size(); i++)
        {
        	System.out.println(emailID.get(i));        
            if(strc==emailID.get(i))
            {
                System.out.println("email ID : " + strc +" "+"EMAIL ID Mtached");
                break;           
            }
            
          
        }

    }

}
