package JavaTest;

public class AEmphasis {
    public static void main(String[] args) {
       String  myString	 ="PrOgRaMmErS";
        myString = myString.toLowerCase();
        myString = myString.replaceAll("a", "A");
        System.out.println(myString);

    }
}
