import java.util.Arrays;

public class StringAnagram {
    public static void main(String[] args) {
        String word1 = "silent";
        String word2 ="listenoi";

        System.out.println("Is Anagram: "+isAnagram(word1,word2));

    }

    public static boolean isAnagram(String word1, String word2){

        char [] firstWord= word1.toCharArray();
        Arrays.sort(firstWord);
        System.out.println(firstWord);

        char [] secondWord= word2.toCharArray();
        Arrays.sort(secondWord);
        System.out.println(secondWord);

        //return firstWord.equals(secondWord);
        return Arrays.equals(firstWord,secondWord);
    }
}
