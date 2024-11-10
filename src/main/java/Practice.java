import java.util.HashMap;

public class Practice {
    public static void main(String[] args) {
        String text = "aabbbcdddd"; //a2b3c1d4
        HashMap<String, Integer> map = new HashMap<>();
        StringBuilder sb1 = new StringBuilder();
        for(String s : text.split("")){
            map.put(s, map.getOrDefault(s, 0)+1);
        }
        System.out.println(map);
        StringBuilder sb = new StringBuilder();

        map.entrySet().forEach(entry -> {
            sb.append(entry.getKey()).append(entry.getValue());
        });
        System.out.println(sb);
    }
}
