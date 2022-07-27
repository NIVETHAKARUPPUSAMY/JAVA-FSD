package Non_Assisted_projects;
import java.util.Scanner;
public class LongestIncreasingSubsequence {

	static int incre_subseq(int my_arr[], int arr_len){
	      int seq_arr[] = new int[arr_len];
	      int i, j, max = 0;
	      for (i = 0; i < arr_len; i++) 
	         seq_arr[i] = 1;
	      for (i = 1; i < arr_len; i++) 
	      for (j = 0; j < i; j++) 
	      if (my_arr[i] > my_arr[j] && seq_arr[i] < seq_arr[j] + 1)
	      seq_arr[i] = seq_arr[j] + 1;
	      for (i = 0; i < arr_len; i++) 
	      if (max < seq_arr[i])
	      max = seq_arr[i];
	      return max;
	   }

		public static void main(String args[])
		{
			int n;
			System.out.println("Enter the value for n:  ");
			try (Scanner sc = new Scanner(System.in)) {
				n=sc.nextInt();
				System.out.println("Enter "+n+" values  :");
				int arr []=new int [n];
				for(int i=0;i<n;i++) {
					arr[i]=sc.nextInt();			
					}
				System.out.println("The length of the longest increasing subsequence is " + incre_subseq(arr, n));
			}
		}
		
}
	
