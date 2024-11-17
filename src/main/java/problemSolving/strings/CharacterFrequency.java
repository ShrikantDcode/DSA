package problemSolving.strings;

public class CharacterFrequency {
    public static void main(String[] args) {
        String text = "aabbbcdddd";
        StringBuilder sb = new StringBuilder();
        int count = 1;

        for(int i = 0; i < text.length() -1; i++) {
            if(text.charAt(i) == text.charAt(i+1)) {
                count++;
            } else {
                sb.append(text.charAt(i)).append(count);
                count = 1;
            }

        }
        sb.append(text.charAt(text.length()-1)).append(count);
        System.out.println(sb);


    }
}
