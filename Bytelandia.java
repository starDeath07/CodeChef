/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Bytelandia
{
	public static void main (String[] args) throws java.lang.Exception {
	    Scanner sc = new Scanner(System.in);
	    int T = sc.nextInt();
	    
	    while(T-- > 0) {
	        int N = sc.nextInt();
	        int[] arrival = new int[N];
	        int[] depart = new int[N];
	        for(int i=0; i<N; i++) {
	            arrival[i] = sc.nextInt();
	        } 
	        
	        for(int i=0; i<N; i++) {
	            depart[i] = sc.nextInt();
	        }
	        
	        Arrays.sort(arrival);
	        Arrays.sort(depart);
	        
	        int ans = 1, i = 0, j = 1, max = 1;
	        while(i < N && j < N) {
	            if(depart[i] > arrival[j]) {
	                ans++;
	                j++;
	            } else if(depart[i] < arrival[j]){
	                ans--;
	                i++;
	            } else if(depart[i] == arrival[j]) {
	                i++;
	                j++;
	            }
	            if(ans > max) max = ans;
	        }
	        System.out.println(max);
	    }
	}
}
