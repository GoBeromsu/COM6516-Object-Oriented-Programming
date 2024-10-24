package code4;

public class Student extends Person {

    private String course;

    Student(String course, String name, String birth) {
        super(name, birth);
        this.course = course;

    }

    @Override
    public String toString() {
        return "Student  course: " + course + super.toString();
    }
}
