package problemSolving.strings;

public class ReverseString {
    public static void main(String[] args) {
        String s = "mango";
        StringBuilder reversed = new StringBuilder();
        for(int i=s.length()-1; i>= 0; i--){
            reversed.append(s.charAt(i));
        }
        System.out.println("ans ="+reversed);
    }
}
