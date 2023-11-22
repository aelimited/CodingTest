package part3;

public class StringMul {
    public static void main(String[] args) {
        String arr = "String";
        String s = sloution(arr,3);
        System.out.println(s);

    }
    public static String sloution(String my_String, int k){
        String answer = "";
        for(int i=0;i<k;i++) {
            answer += my_String;
        }
        return answer;
    }

}
