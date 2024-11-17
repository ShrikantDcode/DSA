package problemSolving.strings;

public class FindLongestuniqueSubstring {
    // Function to find the length of the longest
    // substring without repeating characters
    static int longestUniqueSubstr(String s) {
        int n = s.length();
        int res = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            // Initializing all characters as not visited
            boolean[] visited = new boolean[256];
            for (int j = i; j < n; j++) {
                // If current character is visited,
                // Break the loop
                if (visited[s.charAt(j)]) {

                     sb.append(s.charAt(j));
                    break;
                }
                else {
                    // Else update the result if this
                    // window is larger, and mark current
                    // character as visited.
                    res = Math.max(res, j - i + 1);
                    visited[s.charAt(j)] = true;
                }
            }
        }
        System.out.println(sb);
        return res;
    }

    public static void main(String[] args) {
        String s = "reversestrin";
        System.out.println(longestUniqueSubstr(s));
    }
}
