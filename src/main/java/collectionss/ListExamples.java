package collectionss;

import java.util.*;

public class ListExamples {

    public static void main(String[] args) {
        List arrayList = new ArrayList();
        List linkedListst = new LinkedList();
        List vector = new Vector();
        /*System.out.println(arrayList.size());
        System.out.println(linkedListst.size());
        System.out.println(vector.size());
        System.out.println(((Vector) vector).capacity());*/

        Set set= new TreeSet();
        set.add("1");
        set.add("null");
        set.add("null");
        set.add("3");
        set.add("Santosh");
        set.add("Ravi");
        System.out.println(set);

        Queue queue= new PriorityQueue();
        //Deque arrayDeque= new ArrayDeque();

        Map map= new HashMap();
        Map map1= new LinkedHashMap();
        Map map2= new TreeMap();
    }
}
