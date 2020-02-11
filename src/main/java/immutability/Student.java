package immutability;

public final class Student {

    private final Integer id;
    private final String name;
    private final Age age;

    public Student(Integer id, String name, Age age) {
        this.id = id;
        this.name = name;
        //this.age = age;

        Age cloneAge = new Age();
        cloneAge.setDay(age.getDay());
        cloneAge.setMonth(age.getMonth());
        cloneAge.setYear(age.getYear());
        this.age = cloneAge;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Age getAge() {
        //return age;
        Age cloneAge = new Age();
        cloneAge.setDay(this.age.getDay());
        cloneAge.setMonth(this.age.getMonth());
        cloneAge.setYear(this.age.getYear());
        return cloneAge;
    }
}
