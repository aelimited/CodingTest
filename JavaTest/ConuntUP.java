package JavaTest;

public class ConuntUP {
    public static void main(String[] args) {
        int start_num =3;
        int end_num=10;
        int[] answer = new int[end_num-start_num+1];

        for(int i=0;i<=end_num-start_num;i++){
            answer[i] = i+start_num;

            System.out.println(answer[i]);
        }
    }
}
