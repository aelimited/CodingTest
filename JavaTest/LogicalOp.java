package JavaTest;

public class LogicalOp {
    public static void main(String[] args) {
        boolean x1 = false;
        boolean x2 = true;
        boolean x3 = true;
        boolean x4 = true;

       // boolean answer = true;

        boolean answer = (x1 || x2) && (x3 || x4);
        System.out.println(answer);
        //  return answer;
    }
}
