package CardGame2164;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CardGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> q = new LinkedList<>();
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            q.add(i);
        }

        //while(q.size()>1)
        for(int i=n ; i>=1 ;i--){
            q.poll();
            q.add(q.poll());
        }
        System.out.println("q = " + q);
    }
}
