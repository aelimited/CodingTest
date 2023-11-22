package JavaTest;

public class Solution {
    public static void main(String[] args) {
        String[] arr = {"a","b","c"};
         String s = sloution1(arr);
        System.out.println(s);

    }
    public static String sloution1(String[] arr){
        String answer = String.join("",arr);
        return answer;
    }
}
