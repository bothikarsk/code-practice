import java.util.*;

public class Sorting {
    public static void main(String[] args) {

        String strArray[] = {"Bos45H", "Jon23F", "Kat3535o", "Bob646"};
        Arrays.sort(strArray);
        System.out.println(Arrays.toString(strArray));
       // sortArray(strArray);
    }

    public static void sortArray(String strArray[]) {
        Set<String> set = new HashSet<String>();
        for (String str : strArray) {
            set.add(str);
        }
        //Collections.sort();
        System.out.println(set);
    }
}
