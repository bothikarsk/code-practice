public class AtoZWordPresenseInString {
    public static void main(String[] args) {

        boolean[] allAlphabets = new boolean[26];
        boolean flag = true;
        String str = "The quick brown fox jumps over the lazy dog";
        int index = 0;
        for (int i = 0; i < str.length(); i++) {
            if ('A' <= str.charAt(i) && str.charAt(i) <='Z') {
                index = str.charAt(i) - 'A';
                System.out.println("index:" +index);
            } else if ('a' <= str.charAt(i) && str.charAt(i) <='z') {
                index = str.charAt(i) - 'a';
                System.out.println("index:" +index);
            }
            allAlphabets[index] = true;
        }

        for (int i = 0; i < 26; i++) {
            if (!allAlphabets[i]) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("All Alphabets are present");
        } else {
            System.out.println("All alphabets not present");
        }
    }
}
