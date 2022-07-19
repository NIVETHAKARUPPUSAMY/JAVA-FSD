
public class METHODS {
	int circle(double pi,int r)
	{
		double area= pi*r*r;
		return (int) area;
	}
	int circle(int r)
	{
		int diameter=2*r;
		return diameter;
	}
	public static void main(String[]args)
	{
		METHODS a=new METHODS();
		double b=a.circle(3.14,12);
		int c=a.circle(12);
		System.out.println(b);
		System.out.println(c);
	}

}
