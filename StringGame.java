/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class StringGame
{
	public static void main (String[] args) throws java.lang.Exception {
	    Scanner sc = new Scanner(System.in);
	    int T = sc.nextInt();
	    
	    while(T-- > 0) {
	        int N = sc.nextInt();
	        String str = new String(sc.next());
	        int count1 = 0;
	        int count0 = 0;
	        
	        for(char ch : str.toCharArray()) {
	            if(ch == '1') count1++;
	            else count0++;
	        }
	        
	        int pair = Math.min(count1, count0);
	        if(pair % 2 == 0) System.out.println("RAMOS");
	        else System.out.println("ZLATAN");
	    }
	}
}
