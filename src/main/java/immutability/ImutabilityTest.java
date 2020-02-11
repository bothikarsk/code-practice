package immutability;

public class ImutabilityTest {
    public static void main(String[] args) {
        Age age = new Age();
        age.setDay(22);
        age.setMonth(8);
        age.setYear(1990);

        Student student = new Student(24, "Santosh", age);
        System.out.println("Santosh age:" + student.getAge().getYear());
        //age.setYear(1993);
        student.getAge().setYear(1993);
        System.out.println("Santosh age:" + student.getAge().getYear());

    }
}
