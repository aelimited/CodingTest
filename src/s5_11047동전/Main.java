package s5_11047동전;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 가지고 있는 동전
        int K = sc.nextInt(); //합이라는데 뭘까..
        int[] A = new int[N]; //동전의 가치를 저장하는 배열

        for (int i = 0; i < N; i++) {  // 받은 값을 배열에 저장
            A[i] = sc.nextInt();
        }

        int cnt = 0;
        for (int i = N - 1; i >= 0; i--) { //최솟값을 구해야 함으로 0이 될때까지 반복
            if (A[i] <= K) {  //k의 값이 배열 안에 있는 값보다 작아야 거스름돈을 줄 수 있음.
                cnt += (K / A[i]);  // 배열에 있는 값을 나눈다
                K = K % A[i];   //나머지 값을 저장
            }
        }
        System.out.println(cnt);
    }
}
