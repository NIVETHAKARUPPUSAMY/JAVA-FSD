package Diamond;

public class Diamond implements class1,class2 {
	public void show() 
    {  
        class1.super.show(); 
        class2.super.show(); 
    } 
	public static void main(String[] args)    
    { 
        Diamond ob = new Diamond(); 
        ob.show(); 
    } 

}
