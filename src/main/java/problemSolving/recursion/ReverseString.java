package problemSolving.recursion;

import java.util.Objects;

public class ReverseString {
    public static void main(String[] args) {
        String s = "Shrikant";
        System.out.println("Ans : "+reverse(s));

    }
    static String reverse(String s){
        System.out.println(s);
        if(Objects.isNull(s) || s.length() <=1){
            return s;
        }

        return reverse(s.substring(1))+s.charAt(0);
    }
}
