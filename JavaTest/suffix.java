package JavaTest;

public class suffix {
    public static void main(String[] args) {
        String my_string="banana";
        String is_string="an";
        int anwer=0;
        if(my_string.endsWith(is_string)){
            anwer =1;
        }
        System.out.println(anwer);

        String st = "java";
        System.out.println(st.startsWith("J")); //flase
        System.out.println(st.startsWith("j")); //true
        System.out.println(st.endsWith("a")); //true
        System.out.println(st.endsWith("b")); //flase

    }
}
