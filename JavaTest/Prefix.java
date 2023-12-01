package JavaTest;

public class Prefix {
    public static void main(String[] args) {
        String my_string="banana";
        String is_prefix="ban";
        int anwer=((my_string.startsWith(is_prefix)) ? 1:0);

        System.out.println(anwer);
    }
}
