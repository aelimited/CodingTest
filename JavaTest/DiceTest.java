package JavaTest;

public class DiceTest {
    public static void main(String[] args) {
        int a = 2;
        int b = 6;
        int answer = 0;

        if ((a % 2 == 1) && (b % 2 == 1)) {
            answer = (int) ((Math.pow(a, 2)) + (Math.pow(b, 2)));
        } else if (((a % 2 == 1) && (b % 2 == 0)) || ((b % 2 == 1) && (a % 2 == 0))) {
            answer = (a + b) * 2;
        } else if ((a % 2 == 0) && (b % 2 == 0)) {
            answer=Math.abs(a-b);
        }
        System.out.println(answer);

    }
}
