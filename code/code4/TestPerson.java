package code4;

public class TestPerson {
    public static void main(String[] args) {
        Student student = new Student("OOP", "Kick", "1999.01.12");
        Tutor tutor = new Tutor( "The diamond","Bob", "1999.01.12");
        System.out.println(student);
        System.out.println(tutor);
    }
}
