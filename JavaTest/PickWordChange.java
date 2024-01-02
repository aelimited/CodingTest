package JavaTest;

import java.util.Locale;

public class PickWordChange {
    public static void main(String[] args) {
        String my_string = "programmers";
        String alp = "p";

        String answer = my_string.replace(alp,alp.toUpperCase());

        System.out.println(answer);

    }
}
