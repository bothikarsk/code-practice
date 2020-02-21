package hashcodeandequals;

import java.util.HashSet;
import java.util.Set;

public class EqualsTest {
    public static void main(String[] args) {
        Student s1 = new Student(10, "Santosh");
        Student s2 = new Student(10, "Santosh");
        System.out.println(s1.equals(s2));

        Set<Student> studentSet = new HashSet<>();
        studentSet.add(s1);
        studentSet.add(s2);

        System.out.println(studentSet.size());
    }
}
