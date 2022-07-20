package Multithreading_Exceptionhandling;

public class classandobjects {
	int rollno;
	String name;
	int age;
	
	public classandobjects()
	{
		 this.rollno = rollno; 
		 this.name = name; 
		 this.age = age; 
	}
	void print(int rollno,String name,int age)
	{
		System.out.println("Rollno : "+" "+rollno+" "+"Name :"+name+" "+"Age :"+age);
	}
	
	public static void main(String[] args)
	{
		classandobjects co=new classandobjects();
		co.print(1,"abc",13);
		co.print(2,"bcd",14);
	}

}



