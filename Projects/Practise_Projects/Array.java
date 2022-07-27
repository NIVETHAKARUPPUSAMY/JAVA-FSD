package Practise_Projects;

public class Array {
		
	public static void main(String[] args) {

		//single-dimensional array
		int a[]= {1,2,3,4,5};
		for(int i=0;i<5;i++) {
		System.out.println("Elements of array a: "+a[i]);
		}


		//multidimensional array
		int[][] b = {{1,2,3},{3, 4, 5},{6,7,8}};
		for(int i=0;i<3;i++)
		{
			for(int J=0;J<3;J++)
			{
				 System.out.println("Elements of array " + b[i][J]);
			}
		}
		
	}
}
