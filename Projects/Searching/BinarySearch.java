package Searching;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {

			int arr[] = {10,20,30,40,50};
			int key;
			System.out.println("Enter the value forkey to find index: ");
			Scanner sc= new Scanner(System.in);  
	        key=sc.nextInt();
	        int result = Arrays.binarySearch(arr,key);
	        System.out.println("Element is found at index: "+result); 
	       
		}
	
}


