public class SubStringPalindrome {

    public static void main(String[] args) {
        String str = "abasdxyxfffzuhu";
        System.out.println(getPalindromeStrings(str));
    }

    private static int getPalindromeStrings(String str) {

        int palindromeCount = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                if (str.substring(i, j).length() > 1) {
                    if (isPalindrome(str.substring(i, j))) {
                        System.out.println("palindrom: " + str.substring(i, j));
                        palindromeCount++;
                    }
                }
            }
        }
        return palindromeCount;
    }

    private static boolean isPalindrome(String str) {
        StringBuilder reverse = new StringBuilder(str);
        reverse.reverse();
        return str.equals(reverse.toString());
    }
}
