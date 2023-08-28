/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ProfferAndDirections
{
	public static void main (String[] args) throws java.lang.Exception {
	    Scanner sc = new Scanner(System.in);
	    int T = sc.nextInt();
	    
	    while(T-- > 0) {
	        int N = sc.nextInt();
	        sc.nextLine();
	        String str = new String(sc.nextLine());
	        char prev = 'a';
	        boolean flag = true;
	        
	        for(char ch : str.toCharArray()) {
	            if(prev - ch == 0) {
	                System.out.println("YES"); 
	                flag = false;
	                break;
	            }else {
	                prev = ch;
	            }
	        }
	        if(flag) System.out.println("NO");
	    }
	}
}
