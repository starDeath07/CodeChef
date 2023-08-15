import java.util.*;
import java.lang.*;
import java.io.*;

class MaxColor
{
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0) {
            Integer[] arr = new Integer[3];
            for(int i=0; i<3; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println(finder(arr,3));
        }
    }

    public static int finder(Integer[] arr, int N) {
        int ans = 0;
        Arrays.sort(arr, ((a, b) -> b - a));
        for(int i=0; i<3; i++) {
            if(arr[i] > 0 ) {
                ans++;
                --arr[i];
            }
        }

        if(arr[0] > 0 && arr[1] > 0) {
            ans++;
            --arr[0]; --arr[1];
        }
        if(arr[1] > 0 && arr[2] > 0) {
            ans++;
            --arr[1]; --arr[2];
        }
        if(arr[0] > 0 && arr[2] > 0) {
            ans++;
            --arr[0]; --arr[2];
        }
        return ans;
    }
}