import java.util.HashMap;
import java.util.Map;

public class DuplicateChars {
    public static void main(String[] args) {
        String str = "programming";
        char[] chars = str.toCharArray();
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        /*for (int i = 0; i < chars.length; i++) {
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    System.out.println(chars[i] + " is duplicate");
                }
            }
        }*/

        for (int i = 0; i < chars.length; i++) {
            if (map.containsKey(chars[i])) {
                int count = map.get(chars[i]);
                map.put(chars[i], count + 1);
            } else {
                map.put(chars[i], 1);
            }
        }
        System.out.println(map);
        for (Map.Entry<Character, Integer> me : map.entrySet()) {
            if (me.getValue() > 1) {
                System.out.println(me.getKey()+" : "+me.getValue());
            }
        }
    }
}
