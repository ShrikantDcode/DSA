package recursion;

public class PalindromCheck {
    public static void main(String[] args) {
        String s = "abdba";
        System.out.println(palindromCheck(s));

    }
    static boolean palindromCheck(String s){
        if(s.isEmpty() || s.length() == 1){
            return true;
        }
        if(s.charAt(0) == s.charAt(s.length() -1)){
            return palindromCheck(s.substring(1, s.length()-1));
        }
        return false;
    }
}
