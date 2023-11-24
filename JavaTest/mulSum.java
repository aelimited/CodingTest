package JavaTest;

public class mulSum {
    public static void main(String[] args) {
        int[] num_list ={3,4,5,2,1};
        int answer = 0;
        int sum =0;
        int mul = 1;

        for(int i=0; i<num_list.length;i++){
            sum+=num_list[i];
            mul *= num_list[i];
        }

        answer=((mul<(sum*sum)) ? 1:0);

        System.out.println(mul);
        System.out.println(sum);
        System.out.println(answer);

       // return answer;
    }
}
