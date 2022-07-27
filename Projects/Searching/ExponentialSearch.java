package Searching;

import java.util.*;
import java.math.*;

public class ExponentialSearch {
  public static void main(String[] args) {
   int array[] = {5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60};
   int Key = 50;
   int result = expSearch(array, array.length, Key);
   System.out.println("Element is present at index: " + result);
  }
  static int expSearch(int array[], int n, int Key)
  {
	  if(array[0] == Key) {
	   return 0;
	  }
	  
	  int i = 1;
	  while (i < n && array[i] <= Key) {
	   i = i * 2;
	  }
	 
	  return Arrays.binarySearch(array, (i / 2), Math.min(i, n), Key);
	}
}