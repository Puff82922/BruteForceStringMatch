public class Main {
    public static void main(String[] args) {
        String text = "Hellobye";
        String pattern = "bye";

        String result = bruteForceSearch(text, pattern);

        if (result != "") {
            System.out.println("Pattern found at index " + result);
        } else {
            System.out.println("Pattern not found in the text.");
        }
    }
    public static String bruteForceSearch(String text, String pattern) {
        int n = text.length();
        int m = pattern.length();

        String output = "";

        for (int i = 0; i <= n - m; i++) {
            int j = 0;
            while (j < m && text.charAt(i + j) == pattern.charAt(j)) {
                output = output + text.charAt(i + j);
                j++;
            }
            if (j == m) {
                output = output + "-";
            }
        }

        return output; // Pattern not found in the text
    }
}
