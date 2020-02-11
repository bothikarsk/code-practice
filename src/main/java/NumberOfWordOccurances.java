import java.util.HashMap;
import java.util.Map;

public class NumberOfWordOccurances {

    public static void main(String[] args) {
        String input = "This this is is done by Santosh Bothikar";
        Map<String, Integer> map = new HashMap<String, Integer>();

        String[] strArray = input.split(" ");
        for (int i = 0; i < strArray.length; i++) {
            if (map.containsKey(strArray[i])){
                int count= map.get(strArray[i]);
                map.put(strArray[i],count+1);
            }else{
                map.put(strArray[i],1);
            }
        }
       // System.out.println("Number of occurances of words: \n"+map);
        for(Map.Entry<String,Integer> me:map.entrySet()){
            System.out.println(me.getKey()+" : "+me.getValue());
        }
    }
}
