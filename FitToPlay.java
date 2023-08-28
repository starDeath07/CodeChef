/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class FitToPlay
{
	public static void main (String[] args) throws java.lang.Exception {
	    Scanner sc = new Scanner(System.in);
	    int T = sc.nextInt();
	    
	    while(T-- > 0) {
	        int N = sc.nextInt();
	        int max = 0;
	        int match = Integer.MAX_VALUE;
	        int[] arr = new int[N];
	        
	        for(int i=0; i<N; i++) {
	            arr[i] = sc.nextInt();
	            if(arr[i] < match) match = arr[i];
	            max = Math.max(max, arr[i] - match);
	        }
	        
	        if(max > 0) System.out.println(max);
	        else System.out.println("UNFIT");
	    }
	}
}
