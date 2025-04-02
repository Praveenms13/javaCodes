public class TrimStringUsingCharAt {
    public static int[] findTrimIndices(String str) {
        int start = 0, end = str.length() - 1;
        while (start <= end && str.charAt(start) == ' ') {
            start++;
        }
        while (end >= start && str.charAt(end) == ' ') {
            end--;
        }
        return new int[]{start, end};
    }
    
    public static String customSubstring(String str, int start, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i <= end; i++) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }
    
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        String input = "   Hello World   ";
        int[] indices = findTrimIndices(input);
        String trimmedCustom = customSubstring(input, indices[0], indices[1]);
        String trimmedBuiltIn = input.trim();
        boolean areEqual = compareStrings(trimmedCustom, trimmedBuiltIn);
        System.out.println("Original String: '" + input + "'");
        System.out.println("Trimmed (Custom): '" + trimmedCustom + "'");
        System.out.println("Trimmed (Built-in): '" + trimmedBuiltIn + "'");
        System.out.println("Are both methods equal? " + areEqual);
    }
}