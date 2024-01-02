package JavaTest;

public class N_beasu {
    public static void main(String[] args) {
        //String arr = "String";
        int s = sloution(18,3);
        System.out.println(s);

    }
    public static int sloution(int num, int n){
       /// String answer = "";

        if(num%n==0){
            return 1;
        }else {
            return 0;
        }
    }
}
