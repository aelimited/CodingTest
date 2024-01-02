package JavaTest;

public class CountDown {
    public static void main(String[] args) {
        int start=10;
        int end_num=3;
        int[] answer = new int[start-end_num+1];
        for(int i=0; i<answer.length; i++){
            answer[i] += (start-i);
        }
        for ( int a=0; a<answer.length;a++){
            System.out.println(answer[a]);
        }
    }
}
