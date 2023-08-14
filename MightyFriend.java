import java.util.PriorityQueue;
import java.util.Scanner;

public class MightyFriend {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            int sum1 = 0;
            int sum2 = 0;
            PriorityQueue<Integer> pq1 = new PriorityQueue<>((a, b) -> b - a);
            PriorityQueue<Integer> pq2 = new PriorityQueue<>();

            for(int i=0; i<N; i++) {
                if(i%2 == 0) {
                    int a = sc.nextInt();
                    sum1 += a;
                    pq1.offer(a);
                } else {
                    int b = sc.nextInt();
                    pq2.offer(b);
                    sum2 += b;
                }
            }

            if(sum2 > sum1) {
                System.out.println("YES");
                continue;
            }

            for(int i=0; i<K; i++) {
                if(pq1.size() < 1 || pq2.size() < 1) break;
                int temp1 = pq1.poll();
                int temp2 = pq2.poll();
                sum1 += (-temp1 + temp2);
                sum2 += (-temp2 + temp1);
            }

            if(sum2 > sum1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
